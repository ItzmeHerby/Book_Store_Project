package com.bookstore.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bookstore.entity.Book;
import com.bookstore.repository.BookRepository;

@Service
public class BookService {

	@Autowired
	private BookRepository bookRepository ;
	
	
	public void saveBook(Book b)
	{
		bookRepository.save(b);  // method call -  already present in repo (JPA repository method)
	}
	
	public List<Book> getAllBooks()
	{
		return bookRepository.findAll();  // method call - already present in repo (JPA repository method)
	}
	
	
	public Book getBookById (int id) // method call - to get book by passing id 
	{
		return bookRepository.findById(id).get();
	}
}
