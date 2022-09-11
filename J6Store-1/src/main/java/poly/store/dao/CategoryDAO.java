package poly.store.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import poly.store.entity.Category;

@Service
public interface CategoryDAO extends JpaRepository<Category, String>{
    
}
