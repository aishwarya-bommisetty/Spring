package com.plural.service;

import java.util.List;

import com.plural.model.Customer;
import com.plural.repository.CustomerRepository;
import com.plural.repository.HibernateCustomerRepositoryImpl;

public class CustomerServiceImpl implements CustomerService {

	private CustomerRepository custRepo = new HibernateCustomerRepositoryImpl();
	
	/* (non-Javadoc)
	 * @see com.plural.service.CustomerService#findAll()
	 */
	@Override
	public List<Customer> findAll() {
		return custRepo.findAll();
	}
}
