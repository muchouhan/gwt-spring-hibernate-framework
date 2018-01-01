package com.mukund.frm.dao;

import com.mukund.frm.model.Book;

public interface NotificationRepository {
	public void send(Book b);
}
