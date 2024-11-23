package com.Bike.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Bike.Entity.Bike;
import com.Bike.Service.Bike_Service;

@RestController
public class Bike_Controller {
	@Autowired
	Bike_Service bikeser;
	@PostMapping(value="/addbike")
	public String addBike(@RequestBody List<Bike> b) {
		return bikeser.addBike(b);
	}
	@GetMapping(value="/getbike")
	public List<Bike> getBike(){
		return bikeser.getBike();
	}
	

}
