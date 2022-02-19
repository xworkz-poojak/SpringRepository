package com.xworkz.hotelvendor.entity;

import com.xworkz.hotelvendor.constant.Type;

public class HotelVendorEntity {
	
	private String name;
	private String location;
	private int rating;
	private Type type;
	
	public HotelVendorEntity() {
System.out.println("created HotelVendorEntity");
	}

	public HotelVendorEntity(String name, String location, int rating, Type type) {
		super();
		this.name = name;
		this.location = location;
		this.rating = rating;
		this.type = type;
	}

	@Override
	public String toString() {
		return "HotelVendorEntity [name=" + name + ", location=" + location + ", rating=" + rating + ", type=" + type
				+ "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((location == null) ? 0 : location.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + rating;
		result = prime * result + ((type == null) ? 0 : type.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		HotelVendorEntity other = (HotelVendorEntity) obj;
		if (location == null) {
			if (other.location != null)
				return false;
		} else if (!location.equals(other.location))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (rating != other.rating)
			return false;
		if (type != other.type)
			return false;
		return true;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}

	
}
