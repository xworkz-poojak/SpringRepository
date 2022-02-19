package com.xworkz.fooddelivery.tester;

import com.xworkz.fooddelivery.constant.FoodType;
import com.xworkz.fooddelivery.entity.FoodItemEntity;
import com.xworkz.fooddelivery.repository.FoodItemRepository;
import com.xworkz.fooddelivery.repository.FoodItemRepositoryImpl;
import com.xworkz.fooddelivery.service.FoodItemService;
import com.xworkz.fooddelivery.service.FoodItemServiceImpl;

public class FoodItemTester {
public static void main(String[] args) {
	
	FoodItemEntity entity=new FoodItemEntity("veg palav",120,FoodType.SOUTHINDIAN,4,50.00);
	
	FoodItemRepository itemRepository=new FoodItemRepositoryImpl();
	
	FoodItemService foodItemService=new FoodItemServiceImpl(itemRepository);
	itemRepository.save(entity);
}
}
