package com.example.FurnitureDatabase.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Furnitureproduct {

	@Id
	private String furniturename;
	private String furnituredesc;
	private String furnitureurl;
	public String getFurniturename() {
		return furniturename;
	}
	public void setFurniturename(String furniturename) {
		this.furniturename = furniturename;
	}
	public String getFurnituredesc() {
		return furnituredesc;
	}
	public void setFurnituredesc(String furnituredesc) {
		this.furnituredesc = furnituredesc;
	}
	public String getFurnitureurl() {
		return furnitureurl;
	}
	public void setFurnitureurl(String furnitureurl) {
		this.furnitureurl = furnitureurl;
	}
	
	
	
	
	
	
	
	
	
}
