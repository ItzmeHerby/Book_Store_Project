package com.bookstore.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.bookstore.entity.Book;
import com.bookstore.repository.BookRepository;
import com.bookstore.service.BookService;

@Controller
public class BookController {

	@Autowired
	private BookService bookService;

	@GetMapping("/home")
	public String home() {
		return "home";
	}

	@GetMapping("/book-register")
	public String bookRegister() {
		return "book-register";
	}

	@GetMapping("/available-books")
	public ModelAndView availableBooks() {
		List<Book> list = bookService.getAllBooks();
		return new ModelAndView("available-books" , "listOfBooks" , list);
	}

	@GetMapping("/my-collection")
	public String myCollection() {
		return "my-collection";
	}

	@PostMapping("/savebook")
	public String addBook(@ModelAttribute Book b) // to Binding and exposing the view
	{
		bookService.saveBook(b);
		return "redirect:/available-books"; // After registering a book user is re-directed to available-books page
	}

}
