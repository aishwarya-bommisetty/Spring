package com.plural.service;

import java.util.List;

import com.plural.model.Customer;
import com.plural.repository.CustomerRepository;

public class CustomerServiceImpl implements CustomerService {

	private CustomerRepository custRepo;

	public CustomerServiceImpl() {

	}

	public CustomerServiceImpl(CustomerRepository customerRepository) {

	   custRepo = customerRepository;
	}

	@Override
	public List<Customer> findAll() {
		return custRepo.findAll();
	}

	public void setCustRepo(CustomerRepository custRepo) {
		this.custRepo = custRepo;
	}
}
