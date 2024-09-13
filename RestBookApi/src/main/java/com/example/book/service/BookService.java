package com.example.book.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.book.entity.Book;

@Service
public class BookService 
{
	static List<Book>booklist;
	static
	{
		booklist=new ArrayList<>();
		Book b1=new Book(1,"hamlet","shakespeare");
		Book b2=new Book(2,"katha-o-kahini","saratchandra bose");
		booklist.add(b1);
		booklist.add(b2);
	}
	
	public List<Book> getAllBook()
	{
		return booklist;
	}
	
	public Book addNewBook(Book b)
	{
		booklist.add(b);
		return b;
	}
	public Book getbookbyId(int id)
	{
		for(Book b:booklist)
		{
			if(b.getBookid()==id)
			{
				return b;
			}
		}
		return null;
	}
	

}
