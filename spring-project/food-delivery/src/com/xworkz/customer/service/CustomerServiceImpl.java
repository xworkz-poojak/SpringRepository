package com.xworkz.customer.service;

import com.xworkz.customer.entity.CustomerEntity;
import com.xworkz.customer.repository.CustomerRepository;

public class CustomerServiceImpl implements CustomerService{

	private CustomerRepository customerRepository;
	
	public CustomerServiceImpl(CustomerRepository customerRepository) {
System.out.println("created"+this.getClass().getSimpleName());
this.customerRepository=customerRepository;
	
	}
	
	@Override
	public boolean validateAndSave(CustomerEntity entity) {
		System.out.println("ibvoked validateAndSave CustomerServiceImpl"+entity);
		if(entity!=null){
			System.out.println("entity is valid");
			customerRepository.save(entity);
		}else{
			System.out.println("entity is not validate");
		}
		return false;
	}

}
