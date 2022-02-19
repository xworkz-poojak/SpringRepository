package com.xworkz.coffeeday.tester;

import java.time.LocalDateTime;
import java.time.LocalTime;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.coffeeday.entity.CoffeeDayEntity;
import com.xworkz.coffeeday.service.CoffeeDayService;

public class CoffeeDayTester {
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
		CoffeeDayService coffeeDayService=context.getBean(CoffeeDayService.class);
		//CoffeeDayEntity entity=new CoffeeDayEntity( "pune", "sahukar", LocalDateTime.now(), LocalTime.of(2, 10, 5), LocalTime.of(9, 10, 10));
		CoffeeDayEntity entity=new CoffeeDayEntity( "Singapur", "Yaaani", LocalDateTime.now(), LocalTime.of(8, 00,00), LocalTime.of(9, 00, 00));

		coffeeDayService.validateAndSave(entity);
	}

}
