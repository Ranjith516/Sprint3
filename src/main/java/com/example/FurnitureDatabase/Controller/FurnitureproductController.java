package com.example.FurnitureDatabase.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import com.example.FurnitureDatabase.Entity.Furnitureproduct;
import com.example.FurnitureDatabase.Service.FurnitureproductService;

@RestController
public class FurnitureproductController {

	@Autowired
	FurnitureproductService furnitureproductservice;
	
	@PostMapping("/post")
	public Furnitureproduct addProducts(@RequestBody Furnitureproduct furnitureproduct) {
		
		return furnitureproductservice.addproduct(furnitureproduct);
	}
	
	@PutMapping("/update")
	public Furnitureproduct update(@RequestHeader String furniturename, @RequestBody Furnitureproduct furnitureproduct) {

		return furnitureproductservice.updateproduct(furniturename, furnitureproduct) ;
	}
	
	@DeleteMapping("/delete")
	public String delete(@RequestHeader String furniturename) {
		furnitureproductservice.deleteproduct(furniturename);
		return "data deleted";
	}
}
