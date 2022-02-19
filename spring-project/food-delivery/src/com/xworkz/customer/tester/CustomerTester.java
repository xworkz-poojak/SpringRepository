package com.xworkz.customer.tester;

import com.xworkz.customer.entity.CustomerEntity;
import com.xworkz.customer.repository.CustomerRepository;
import com.xworkz.customer.repository.CustomerRepositoryImpl;
import com.xworkz.customer.service.CustomerService;
import com.xworkz.customer.service.CustomerServiceImpl;

public class CustomerTester {
	public static void main(String[] args) {
		CustomerEntity entity=new CustomerEntity("Radha","pune",4,98765432l,"radha@gmail.com");
		CustomerRepository customerRepository=new CustomerRepositoryImpl();
		CustomerService service=new CustomerServiceImpl(customerRepository);
		customerRepository.save(entity);
	}

}
