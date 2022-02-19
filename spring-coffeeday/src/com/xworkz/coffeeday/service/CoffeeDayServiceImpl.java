package com.xworkz.coffeeday.service;

import java.time.LocalDateTime;
import java.time.LocalTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.coffeeday.entity.CoffeeDayEntity;
import com.xworkz.coffeeday.repo.CoffeeDayRepo;

@Component
public class CoffeeDayServiceImpl implements CoffeeDayService {
@Autowired
	private CoffeeDayRepo coffeeDayRepo;

public CoffeeDayServiceImpl(CoffeeDayRepo coffeeDayRepo) {
	this.coffeeDayRepo=coffeeDayRepo;
}
	@Override
	public boolean validateAndSave(CoffeeDayEntity entity) {
		boolean valid = false;

		if (entity.getOwnerName() != null && !(entity.getOwnerName().length() < 5)
				&& !(entity.getOwnerName().length() > 200)) {
			System.out.println(entity.getOwnerName());

			valid = true;
		} else {
			System.out.println("invalid ownerName");
			valid = false;
			return valid;
		}
		
		if (entity.getLocation() != null ) {
			System.out.println(entity.getOwnerName());

			valid = true;
		} else {
			System.out.println("invalid location");
			valid = false;
			return valid;
		}
		
//		LocalDateTime time = LocalDateTime.now();
//
//		if (entity.getStartedDate() != null && entity.getStartedDate().isBefore(time)) {
//			System.out.println(entity.getStartedDate());
//
//			valid = true;
//		} else {
//			System.out.println("invalid Date");
//			valid = false;
//			return valid;
//		}
		
		LocalTime opentime = LocalTime.now();

		if (entity.getOpenTime() != null && entity.getOpenTime().isBefore(opentime)) {
			System.out.println(entity.getOpenTime());

			valid = true;
		} else {
			System.out.println("invalid Date");
			valid = false;
			return valid;
		}
		
		if(valid) {
			coffeeDayRepo.save(entity);
		}
		
		return false;
	}

}
