package com.mukund.frm.dao;

import java.util.List;

import com.mukund.frm.model.Book;
import com.mukund.frm.model.BookSearchCriteria;

public interface BookRepository {

	public List<Book> search(BookSearchCriteria criteria);

	public void add(Book book);

	public void update(Book book);
	
	public void close(Book book);

	public void reParent(Book sourceBook,Book targetBook);
	
}
