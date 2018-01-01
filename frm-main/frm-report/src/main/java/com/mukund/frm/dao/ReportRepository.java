package com.mukund.frm.dao;

import com.mukund.frm.model.Book;

public interface ReportRepository {
	public void generate(Book book);
}
