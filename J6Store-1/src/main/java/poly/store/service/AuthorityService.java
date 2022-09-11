package poly.store.service;

import java.util.List;

import org.springframework.stereotype.Service;

import poly.store.entity.Authority;

@Service
public interface AuthorityService {

	public List<Authority> findAuthoritiesOfAdministrators();

	public List<Authority> findAll();

	public Authority create(Authority auth);

	public void delete(Integer id);

}
