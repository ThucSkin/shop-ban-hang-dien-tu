package poly.store.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import poly.store.dao.CategoryDAO;
import poly.store.entity.Category;
import poly.store.service.CategoryService;

@Service
public class CategoryServiceImpl implements CategoryService{
	@Autowired
	CategoryDAO cdao;
	
	@Override
	public List<Category> findAll() {
		
		return cdao.findAll();
	}

}
