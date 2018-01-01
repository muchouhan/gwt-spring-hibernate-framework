package com.mukund.frm.bookservice;

import java.util.List;

import com.mukund.frm.model.Book;
import com.mukund.frm.model.BookSearchCriteria;

public interface BookService {

	public List<Book> search(BookSearchCriteria criteria);
}
