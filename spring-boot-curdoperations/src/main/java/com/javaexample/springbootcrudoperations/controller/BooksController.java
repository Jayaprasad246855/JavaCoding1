package com.javaexample.springbootcrudoperations.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.javaexample.springbootcrudoperations.model.Books;
import com.javaexample.springbootcrudoperations.service.BooksService;

@RestController
@RequestMapping("/Books/detials")
public class BooksController {

	@Autowired
	BooksService booksServices;

	@GetMapping("/allbooks")
	private List<Books> getAllBooks() {
		return booksServices.getAllBooks();
	}
	
	@GetMapping("/booksByid/{bookId}")
	private Books getBooks(@PathVariable("bookId") int bookId) {
		return booksServices.getBooks(bookId);
	}

	@DeleteMapping("/delete")
	private ResponseEntity<Books> deleteBooks(@RequestParam("bookId") int bookId) {
		return booksServices.delete(bookId);
	}

	@PostMapping("/saveBooks")
	private int saveBooks(@RequestBody Books books) {
		booksServices.saveOrUpdate(books);
		return books.getBookId();
	}

	@PutMapping("/putBook")
	private Books Update(@RequestBody Books books) {
		booksServices.saveOrUpdate(books);
		return books;
	}
}
