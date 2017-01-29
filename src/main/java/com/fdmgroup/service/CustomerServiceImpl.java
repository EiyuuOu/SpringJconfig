package com.fdmgroup.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fdmgroup.model.Customer;
import com.fdmgroup.repository.CustomerRepository;
import com.fdmgroup.repository.HibernateCustomerRepositoryImpl;

@Service("customerService")
public class CustomerServiceImpl implements CustomerService {

	
	private CustomerRepository customerRepository; 
	
	public CustomerServiceImpl(){
		
	}
	
	public CustomerServiceImpl(CustomerRepository customerRepository){
		System.out.println("We are using Constructor Injection");
		this.customerRepository = customerRepository;
	}
	
	@Autowired
	public void setCustomerRepository(CustomerRepository customerRepository) {
		System.out.println("We are using Setter Injection");
		this.customerRepository = customerRepository;
	}

	@Override
	public List<Customer> findAll() {
		return customerRepository.findAll();
	}
}
