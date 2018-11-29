package com.plural.repository;

import java.util.ArrayList;
import java.util.List;

import com.plural.model.Customer;

public class HibernateCustomerRepositoryImpl implements CustomerRepository{

	public List<Customer> findAll() {
		List<Customer> customers = new ArrayList<>();
		
		Customer customer = new Customer();
		
		customer.setFirstname("Aishwarya");
		customer.setLastname("Bommisetty");
		
		customers.add(customer);
		
		return customers;
	}
}
