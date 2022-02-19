package com.xworkz.hotelvendor.repository;

import com.xworkz.hotelvendor.entity.HotelVendorEntity;

public class HotelVendorRepositoryImpl implements HotelVendorRepository{

	public HotelVendorRepositoryImpl() {

	System.out.println("created"+this.getClass().getSimpleName());
	}
	
	@Override
	public void save(HotelVendorEntity entity) {
System.out.println("invoked save HotelVendorRepositoryImpl"+entity);
System.out.println("should save into db using JPA");
	}

}
