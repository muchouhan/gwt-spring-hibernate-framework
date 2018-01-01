package com.mukund.frm.droolservice;

import com.mukund.frm.model.Book;

public interface DroolService {

	public void init();
	
	public Book validate(Book book);

	public Book loadDependentValue(Book book);

}
