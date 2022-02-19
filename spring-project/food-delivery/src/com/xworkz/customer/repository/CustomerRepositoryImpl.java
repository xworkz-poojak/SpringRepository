package com.xworkz.customer.repository;

import com.xworkz.customer.entity.CustomerEntity;

public class CustomerRepositoryImpl implements CustomerRepository {

	public CustomerRepositoryImpl() {

	System.out.println("created CustomerRepositoryImpl "+this.getClass().getSimpleName());
	}
	
	@Override
	public void save(CustomerEntity entity) {
System.out.println("invokes "+entity);
System.out.println("should save into db using JPA");
	}

}
