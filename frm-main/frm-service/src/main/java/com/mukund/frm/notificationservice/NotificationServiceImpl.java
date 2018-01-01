package com.mukund.frm.notificationservice;

import org.springframework.beans.factory.annotation.Autowired;

import com.mukund.frm.dao.NotificationRepository;
import com.mukund.frm.model.Book;

public class NotificationServiceImpl implements NotificationService {

	private NotificationRepository notifRepo;

	@Autowired
	public void setNotifRepo(NotificationRepository notifRepo) {
		this.notifRepo = notifRepo;
	}

	@Override
	public void send(Book b) {
		notifRepo.send(b);
	}

}
