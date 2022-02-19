package com.xworkz.coffeeday.entity;

import java.time.LocalDateTime;
import java.time.LocalTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="coffeeday")
public class CoffeeDayEntity {
	@Id
	@Column(name="C_ID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name="LOCATION")
	private String location;
	
	@Column(name="OWNER")
	private String ownerName;
	
	
	@Column(name="STARTED_DATE")
	private LocalDateTime startedDate;
	
	
	@Column(name="OPEN_TIME")
    private LocalTime openTime;
	
	
	@Column(name="CLOSE_TIME")
     private LocalTime closeTime;


	


	public CoffeeDayEntity( String location, String ownerName, LocalDateTime startedDate, LocalTime openTime,
			LocalTime closeTime) {
		super();
		
		this.location = location;
		this.ownerName = ownerName;
		this.startedDate = startedDate;
		this.openTime = openTime;
		this.closeTime = closeTime;
	}


	public String getLocation() {
		return location;
	}


	public void setLocation(String location) {
		this.location = location;
	}


	public String getOwnerName() {
		return ownerName;
	}


	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}


	public LocalDateTime getStartedDate() {
		return startedDate;
	}


	public void setStartedDate(LocalDateTime startedDate) {
		this.startedDate = startedDate;
	}


	public LocalTime getOpenTime() {
		return openTime;
	}


	public void setOpenTime(LocalTime openTime) {
		this.openTime = openTime;
	}


	public LocalTime getCloseTime() {
		return closeTime;
	}


	public void setCloseTime(LocalTime closeTime) {
		this.closeTime = closeTime;
	}
	
	
	

}
