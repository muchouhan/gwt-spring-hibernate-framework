package com.mukund.frm.bookservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.mukund.frm.dao.BookRepository;
import com.mukund.frm.model.Book;
import com.mukund.frm.model.BookSearchCriteria;

public class BookServiceImpl implements BookService {

	private BookRepository bookRepo;

	@Autowired
	public void setBookRepo(BookRepository bookRepo) {
		this.bookRepo = bookRepo;
	}

	@Override
	public List<Book> search(BookSearchCriteria criteria) {
		return bookRepo.search(criteria);
	}

}
