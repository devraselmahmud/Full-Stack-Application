package com.raselmahmud.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.raselmahmud.entity.Customer;
import com.raselmahmud.service.CustomerService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class CustomerController {
	
	private final CustomerService customerService;
	
	@PostMapping("/customer")
	public Customer postCustomer(@RequestBody Customer customer) {
		return customerService.postCustomer(customer);
	}

}
