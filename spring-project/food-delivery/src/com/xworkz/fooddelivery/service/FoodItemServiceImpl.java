package com.xworkz.fooddelivery.service;

import com.xworkz.fooddelivery.entity.FoodItemEntity;
import com.xworkz.fooddelivery.repository.FoodItemRepository;

public class FoodItemServiceImpl implements FoodItemService{

	private FoodItemRepository itemRepository;
	
	public FoodItemServiceImpl(FoodItemRepository itemRepository) {
System.out.println("created"+this.getClass().getSimpleName());
this.itemRepository=itemRepository;
	}
	
	@Override
	public boolean validateAndSave(FoodItemEntity entity) {
		System.out.println("invoked validateAndSave"+ entity);
		if(entity!=null){
			System.out.println("entity is valid");
			itemRepository.save(entity);
		}else{
			System.out.println("entity is invalide");
		}
		return false;
	}

}
