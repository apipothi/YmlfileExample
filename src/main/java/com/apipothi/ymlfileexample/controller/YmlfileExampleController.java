package com.apipothi.ymlfileexample.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.apipothi.ymlfileexample.service.YmlfileService;

@RestController
public class YmlfileExampleController {


	@Autowired
	YmlfileService ymlervice; 
	
	@GetMapping("/books")
	public void getBookInfo() {

		System.out.println("*Start-Bookcontroller**-getBookInfo()-***");
		
		ymlervice.getFromProperties();
		
		
		System.out.println("*End-Bookcontroller**-getBookInfo()-***");
	}

	
}
