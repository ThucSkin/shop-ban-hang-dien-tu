package poly.store.rest.controller;

import com.fasterxml.jackson.databind.JsonNode;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import poly.store.entity.Order;
import poly.store.entity.Product;
import poly.store.service.OrderService;
import poly.store.service.ProductService;

@CrossOrigin("*")
@RestController
@RequestMapping("/rest/orders")
public class OrderRestController {
	@Autowired
	OrderService orderService;
	

	@PostMapping()
	public Order create(@RequestBody JsonNode orderData){
		return orderService.create(orderData);
	}
}













