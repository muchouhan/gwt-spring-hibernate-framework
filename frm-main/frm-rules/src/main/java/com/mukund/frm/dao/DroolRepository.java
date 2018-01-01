package com.mukund.frm.dao;

import com.mukund.frm.model.Book;

public interface DroolRepository {

	public void init();

	public Book validate(Book book);

	public Book loadDependentValue(Book book);

}
