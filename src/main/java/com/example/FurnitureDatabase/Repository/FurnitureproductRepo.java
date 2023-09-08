package com.example.FurnitureDatabase.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.FurnitureDatabase.Entity.Furnitureproduct;

@Repository
public interface FurnitureproductRepo extends JpaRepository<Furnitureproduct, Integer> {

	@Query(value =  "select * from Furnitureproduct where furniturename =?" , nativeQuery = true)
	Furnitureproduct findByName(String furniturename);

}
