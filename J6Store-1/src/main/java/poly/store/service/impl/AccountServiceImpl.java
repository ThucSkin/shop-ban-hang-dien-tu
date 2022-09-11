package poly.store.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import poly.store.dao.AccountDAO;
import poly.store.entity.Account;
import poly.store.service.AccountService;

@Service
public class AccountServiceImpl implements AccountService{
	@Autowired
	AccountDAO adao;
	
	@Override
	public Account findById(String username) {
		return adao.findById(username).get();
	}

	@Override
	public List<Account> getAdministrators() {
		
		return adao.getAdministrators();
	}

	@Override
	public List<Account> findAll() {
		
		return adao.findAll();
	}
}
