package com.Bike.Dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.Bike.Entity.Bike;
import com.Bike.Repository.Bike_Repository;

@Repository
public class Bike_Dao {
	@Autowired
	Bike_Repository bikerepo;
	
	public String addBike(List<Bike> b) {
		bikerepo.saveAll(b);
		return "Added Successfully";
	}
	
	public List<Bike> getBike(){
		return bikerepo.findAll();
	}

}
