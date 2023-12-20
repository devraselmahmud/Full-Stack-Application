package com.raselmahmud.service;

import org.springframework.stereotype.Service;

import com.raselmahmud.entity.Customer;
import com.raselmahmud.repository.CustomerRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class CustomerService {
	
	private final CustomerRepository customerRepository;
	
	public Customer postCustomer(Customer customer) {
		return customerRepository.save(customer);
	}

}
