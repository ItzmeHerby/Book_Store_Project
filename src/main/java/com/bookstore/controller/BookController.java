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
	
	@GetMapping("/book-register")
	public String bookRegister()
	{
		return "book-register";
	}
	
	@GetMapping("/available-books")
	public String availableBooks()
	{
		return "available-books" ;
	}
	
	@GetMapping("/my-collection")
	public String myCollection()
	{
		return "my-collection";
	}
	
	
}
