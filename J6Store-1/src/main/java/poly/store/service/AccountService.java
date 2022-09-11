package poly.store.service;

import java.util.List;

import poly.store.entity.Account;

public interface AccountService {
	Account findById(String username);

	public List<Account> getAdministrators();

	public List<Account> findAll();

	
}
