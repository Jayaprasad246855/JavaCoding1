package com.javaexample.springbootcrudoperations.repository;

import org.springframework.data.repository.CrudRepository;

import com.javaexample.springbootcrudoperations.model.Books;

public interface BooksRepository extends CrudRepository <Books, Integer>{

}
