package com.example.book.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Book 
{
	@Id
	public int bookid;
	public String bookname;
	public String authorname;
	
	
	public Book() 
	{
		super();
		// TODO Auto-generated constructor stub
	}


	public Book(int bookid, String bookname, String authorname) 
	{
		super();
		this.bookid = bookid;
		this.bookname = bookname;
		this.authorname = authorname;
	}


	public int getBookid() {
		return bookid;
	}


	public void setBookid(int bookid) {
		this.bookid = bookid;
	}


	public String getBookname() {
		return bookname;
	}


	public void setBookname(String bookname) {
		this.bookname = bookname;
	}


	public String getAuthorname() {
		return authorname;
	}


	public void setAuthorname(String authorname) {
		this.authorname = authorname;
	}


	@Override
	public String toString() {
		return "Book [bookid=" + bookid + ", bookname=" + bookname + ", authorname=" + authorname + "]";
	}
	
	
	
	
	
	
	
	
}
