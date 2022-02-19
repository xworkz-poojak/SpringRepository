package com.xworkz.hotelvendor.tester;

import com.xworkz.hotelvendor.constant.Type;
import com.xworkz.hotelvendor.entity.HotelVendorEntity;
import com.xworkz.hotelvendor.repository.HotelVendorRepository;
import com.xworkz.hotelvendor.repository.HotelVendorRepositoryImpl;
import com.xworkz.hotelvendor.service.HotelService;
import com.xworkz.hotelvendor.service.HotelserviceImpl;

public class HotelVendorTester {
	public static void main(String[] args) {
		HotelVendorEntity entity=new HotelVendorEntity("Ashok", "bangalore", 3, Type.CONTINENTAL);
		HotelVendorRepository hotelVendorRepository=new HotelVendorRepositoryImpl();
		HotelService hotelService=new HotelserviceImpl(hotelVendorRepository);
		hotelService.validateAndSave(entity);
	}

}
