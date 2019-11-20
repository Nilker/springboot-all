package com.tangp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tangp.config.PersonConfig;

@RestController
public class HelloController {

	@Autowired
	PersonConfig personConfig;
	
	@RequestMapping("/hello")
	public String hello() {
		System.out.println(personConfig.toString());
		return "hello";
	}
}
