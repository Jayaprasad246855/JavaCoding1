package com.javaexample.springbootcrudoperations.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javaexample.springbootcrudoperations.model.Books;
import com.javaexample.springbootcrudoperations.repository.BooksRepository;

@Service
public class BooksService {
	
	@Autowired
	
	BooksRepository repo;
	
	public List<Books> getAllBooks(){
		
		List<Books> books = new ArrayList <Books>();
		
		repo.findAll().forEach(books1->books.add(books1));
		
		return books;
	}
	public Books getBooksById(int Id) {
		return repo.findById(Id).get();
	}
	public void saveOrUpdate(Books books)   
	{  
		repo.save(books);  
	}  
	public void delete(int id)   
	{  
		repo.deleteById(id);  
	}  
	public void update(Books books, int bookid)   
	{  
		repo.save(books);  
	} 
}
