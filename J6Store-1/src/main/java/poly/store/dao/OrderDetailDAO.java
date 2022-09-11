package poly.store.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import poly.store.entity.OrderDetail;

public interface OrderDetailDAO extends JpaRepository<OrderDetail, Long>{
	
}
