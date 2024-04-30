package com.bookstore.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bookstore.entity.MyCollection;
import com.bookstore.repository.MyCollectionRepository;

@Service
public class MyCollectionService {

	@Autowired
	private MyCollectionRepository myCollectionRepository;
	
	public void saveBookToMyCollection (MyCollection myCollection)
	{
		 myCollectionRepository.save(myCollection);
	}
	
	public List<MyCollection> getAllBooks()
	{
		return myCollectionRepository.findAll();
	}
}
