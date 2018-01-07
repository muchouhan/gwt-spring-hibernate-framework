package com.mukund.frm.service.notification;

import com.mukund.frm.model.Book;

public interface NotificationService {

	void initialize();

	void send(Book b);

}
