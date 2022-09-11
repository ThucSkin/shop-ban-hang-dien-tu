package poly.store.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import poly.store.dao.RoleDAO;
import poly.store.entity.Role;
import poly.store.service.RoleService;
@Service
public class RoleServiceImpl implements RoleService{
	@Autowired
	RoleDAO dao;
	
	@Override
	public List<Role> findAll() {
		
		return dao.findAll();
	}

}
