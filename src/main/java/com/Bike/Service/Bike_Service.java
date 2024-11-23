package com.Bike.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Bike.Dao.Bike_Dao;
import com.Bike.Entity.Bike;

@Service
public class Bike_Service {
	@Autowired
	Bike_Dao bikedao;
	
	public String addBike(List<Bike> b) {
		return bikedao.addBike(b);
	}
	
	public List<Bike> getBike(){
		return bikedao.getBike();
	}

}
