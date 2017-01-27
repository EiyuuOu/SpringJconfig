package com.fdmgroup.service;

import java.util.List;

import com.fdmgroup.model.Customer;
import com.fdmgroup.repository.CustomerRepository;
import com.fdmgroup.repository.HibernateCustomerRepositoryImpl;

public class CustomerServiceImpl implements CustomerService {

	private CustomerRepository customerRepository; 
	
	public void setCustomerRepository(CustomerRepository customerRepository) {
		this.customerRepository = customerRepository;
	}

	@Override
	public List<Customer> findAll() {
		return customerRepository.findAll();
	}
}
