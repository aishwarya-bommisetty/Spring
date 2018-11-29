package com.plural.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.plural.model.Customer;
import com.plural.repository.CustomerRepository;

@Service("customerService")
public class CustomerServiceImpl implements CustomerService {


	// @Autowired
	private CustomerRepository custRepo;
	
	@Autowired
	public CustomerServiceImpl(CustomerRepository customerRepository) {
		System.out.println("constructor injection");
		custRepo = customerRepository;
	}
	//@Autowired
	public void setCustRepo(CustomerRepository custRepo) {
		System.out.println("we're using setter injection");
		this.custRepo = custRepo;
	}

	@Override
	public List<Customer> findAll() {
		return custRepo.findAll();
	}
}
