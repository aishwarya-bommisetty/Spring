package com.plural.service;

import java.util.List;

import com.plural.model.Customer;
import com.plural.repository.CustomerRepository;

public class CustomerServiceImpl implements CustomerService {

	private CustomerRepository custRepo;
	
	public void setCustRepo(CustomerRepository custRepo) {
		this.custRepo = custRepo;
	}

	/* (non-Javadoc)
	 * @see com.plural.service.CustomerService#findAll()
	 */
	@Override
	public List<Customer> findAll() {
		return custRepo.findAll();
	}
}
