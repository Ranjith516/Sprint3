package com.example.FurnitureDatabase.Service;

import com.example.FurnitureDatabase.Entity.Furnitureproduct;

public interface FurnitureproductService {

	Furnitureproduct addproduct(Furnitureproduct furnitureproduct);
	
	Furnitureproduct updateproduct(String furniturename, Furnitureproduct furnitureproductname);
	
	void deleteproduct(String furniturename);
}
