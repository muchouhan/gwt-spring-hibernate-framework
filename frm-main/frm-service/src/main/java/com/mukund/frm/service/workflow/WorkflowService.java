package com.mukund.frm.service.workflow;

import java.util.List;

import com.mukund.frm.model.Book;

public interface WorkflowService {

	void initialize();

	List<Book> fetchBooks();

	void addBook(Book book);

}
