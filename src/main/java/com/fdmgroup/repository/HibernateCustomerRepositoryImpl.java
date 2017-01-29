package com.fdmgroup.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.fdmgroup.model.Customer;

@Repository("customerRepository")
public class HibernateCustomerRepositoryImpl implements CustomerRepository {

	//for app.properties
//	@Value("${dbUsername}")
//	private String dbUsername;
	
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
