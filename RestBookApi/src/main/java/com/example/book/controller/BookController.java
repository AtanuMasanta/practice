package com.example.book.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.book.entity.Book;
import com.example.book.service.BookService;

@RestController
public class BookController 
{
	@Autowired
	BookService bookService;
	@RequestMapping(value="/getAll",method=RequestMethod.GET)
	public ResponseEntity<List<Book>> getallabook()
	{
		List<Book>list=this.bookService.getAllBook();
		if(list.size()==0)
		{
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		}
		return ResponseEntity.of(Optional.of(list));
	}
	
	@PostMapping("/addBook")
	public Book addBook(@RequestBody Book b)
	{
		return this.bookService.addNewBook(b);
	}
	
	@GetMapping("/bookById/{id}")
	public ResponseEntity<Book> getBookById(@PathVariable("id") int id)
	{
		
		Book book= this.bookService.getbookbyId(id);
		if(book==null)
		{
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		}
		return ResponseEntity.of(Optional.of(book));
	}
}
