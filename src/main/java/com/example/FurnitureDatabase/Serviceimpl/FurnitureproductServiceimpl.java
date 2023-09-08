package com.example.FurnitureDatabase.Serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.FurnitureDatabase.Entity.Furnitureproduct;
import com.example.FurnitureDatabase.Exception.ResourceNotFoundException;
import com.example.FurnitureDatabase.Repository.FurnitureproductRepo;
import com.example.FurnitureDatabase.Service.FurnitureproductService;

@Service
public class FurnitureproductServiceimpl implements FurnitureproductService {

	@Autowired
	FurnitureproductRepo furnitureproductrepo;
	
	@Override
	public Furnitureproduct addproduct(Furnitureproduct furnitureproduct) {
		// TODO Auto-generated method stub
		return furnitureproductrepo.save(furnitureproduct);
	}

	@Override
	public Furnitureproduct updateproduct(String furniturename, Furnitureproduct furnitureproductname) {
		// TODO Auto-generated method stub
		  Furnitureproduct s1 = furnitureproductrepo.findByName(furniturename);
			
			if(s1!=null) {
				   
				s1.setFurnituredesc(furnitureproductname.getFurnituredesc());;// old to new set
				s1.setFurnitureurl(furnitureproductname.getFurnitureurl());
			return furnitureproductrepo.save(s1);
			} 
			else 
			{
				throw new ResourceNotFoundException();
			} 
	}

	@Override
	public void deleteproduct(String furniturename) {
		// TODO Auto-generated method stub
		Furnitureproduct s2 = furnitureproductrepo.findByName(furniturename);
		
		if(s2!=null) {
			furnitureproductrepo.delete(s2);;
		}
		else {
			throw new ResourceNotFoundException();
		}
		
	}

}
