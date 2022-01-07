package com.nt.book.controller;


import org.springframework.web.bind.annotation.GetMapping;


import org.springframework.web.bind.annotation.RestController;

import com.nt.book.entites.Book;


@RestController
public class BookController {

	
@GetMapping("/books")
	public Book  getBooks() {
	
	Book book = new Book();
	book.setId(12);
	book.setTitle("java course");
	book.setAuthor("xyz");
		return book;
	}
}
