package com.xworkz.hotelvendor.service;

import com.xworkz.hotelvendor.entity.HotelVendorEntity;
import com.xworkz.hotelvendor.repository.HotelVendorRepository;

public class HotelserviceImpl implements HotelService {

	private HotelVendorRepository hotelVendorRepository;
	
	public HotelserviceImpl(HotelVendorRepository hotelVendorRepository) {
		System.out.println("created"+this.getClass().getSimpleName());
		this.hotelVendorRepository=hotelVendorRepository;
		
	}
	
	@Override
	public boolean validateAndSave(HotelVendorEntity entity) {
System.out.println("invoked validateAndSave "+entity);
if(entity!=null){
	System.out.println("entity is valid");
hotelVendorRepository.save(entity);
}else{
	System.out.println("entity is not valid");
}
		return false;
	}

}
