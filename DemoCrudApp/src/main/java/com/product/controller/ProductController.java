package com.product.controller;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {
	//this is first commit
	
	public String home() {
		System.out.println("this my home url");
		return "index";
	}
}
