package com.fdmgroup.repository;

import java.util.ArrayList;
import java.util.List;

import com.fdmgroup.model.Customer;

public class HibernateCustomerRepositoryImpl implements CustomerRepository {

	
	@Override
	public List<Customer> findAll() {
		List<Customer> customers = new ArrayList<>();
		
		Customer customer = new Customer();
		
		customer.setFirstname("Niko");
		customer.setLastname("Brah");
		
		customers.add(customer);
		
		return customers;
	}
}
