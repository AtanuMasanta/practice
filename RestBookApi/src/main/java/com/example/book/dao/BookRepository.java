package com.example.book.dao;

import org.springframework.data.repository.CrudRepository;

import com.example.book.entity.Book;

public interface BookRepository extends CrudRepository<Book,Integer>
{
	
}
