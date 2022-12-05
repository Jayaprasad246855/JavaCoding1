package com.javaexample.springbootcrudoperations.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
	public Books getBooks(int Id) {
		return repo.findById(Id).get();
	}
	public void saveOrUpdate(Books books)   
	{  
		repo.save(books);
	}  
	
	public ResponseEntity<Books> delete(int id)   
	{   	Books book=null;
		try {
			book=getBooks(id);
			repo.deleteById(id);
		}catch(Exception e) {
			book = new Books();
			book.setBookName("error occured while deleting");
			return new ResponseEntity<>(book,HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<>(book,HttpStatus.OK);
		
	}  
	public void update(Books books, int bookid)   
	{  
		repo.save(books);  
	} 
}
