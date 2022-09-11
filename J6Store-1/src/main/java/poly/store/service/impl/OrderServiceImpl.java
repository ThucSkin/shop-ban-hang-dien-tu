package poly.store.service.impl;

import java.util.List;
import java.util.stream.Collectors;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import poly.store.dao.OrderDAO;
import poly.store.dao.OrderDetailDAO;
import poly.store.entity.Order;
import poly.store.entity.OrderDetail;
import poly.store.service.OrderService;

@Service
public class OrderServiceImpl implements OrderService{
	@Autowired
	OrderDAO dao;
	
	@Autowired
	OrderDetailDAO ddao;

	@Override
	public Order create(JsonNode orderData) {
		ObjectMapper mapper = new ObjectMapper();
		
		Order order = mapper.convertValue(orderData, Order.class);
		dao.save(order);
		
		TypeReference<List<OrderDetail>> type = new TypeReference<List<OrderDetail>>(){};
		List<OrderDetail> details = mapper.convertValue(orderData.get("orderDetails"),type)
				.stream().peek(d -> d.setOrder(order)).collect(Collectors.toList());
			
		ddao.saveAll(details);
		
		return order;
	}

	@Override
	public Order findById(Long id) {
		return dao.findById(id).get();
	}

	@Override
	public List<Order> findByUsername(String username) {
		
		return dao.findByUsername(username);
	}	
}























