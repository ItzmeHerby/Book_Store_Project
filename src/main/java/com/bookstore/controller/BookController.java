package com.bookstore.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class BookController {

	@GetMapping("/home")
	public String home()
	{
		return "home" ;
	}
	
	@GetMapping("/products")
	public String product()
	{
		return "products";
	}
	
	@GetMapping("/products")
	public String product1()
	{
		return "data";
	}
}
