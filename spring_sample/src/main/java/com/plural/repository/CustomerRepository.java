package com.plural.repository;

import java.util.List;

import com.plural.model.Customer;

public interface CustomerRepository {

	List<Customer> findAll();
}
