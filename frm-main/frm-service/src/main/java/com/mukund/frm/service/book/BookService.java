package com.mukund.frm.service.book;

import java.util.List;

import com.mukund.frm.model.Book;

public interface BookService {

	void initialize();

	List<Book> fetchBooks();

	
	void addBook(Book book);
	void updateBook(Book book);
	void deleteBook(Book book);
	
	void addLegacyBook(Book book);
	void updateLegacyBook(Book book);
	void deleteLegacyBook(Book book);
	
}
