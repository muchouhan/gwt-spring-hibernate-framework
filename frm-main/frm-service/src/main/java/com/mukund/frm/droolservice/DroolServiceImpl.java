package com.mukund.frm.droolservice;

import org.springframework.beans.factory.annotation.Autowired;

import com.mukund.frm.dao.DroolRepository;
import com.mukund.frm.model.Book;

public class DroolServiceImpl implements DroolService {

	private DroolRepository droolRepo;

	@Autowired
	public void setDroolRepo(DroolRepository droolRepo) {
		this.droolRepo = droolRepo;
	}

	@Override
	public Book validate(Book book) {
		return droolRepo.validate(book);
	}

	@Override
	public Book loadDependentValue(Book book) {
		return droolRepo.loadDependentValue(book);
	}

	@Override
	public void init() {
		droolRepo.init();
	}

}
