package com.mukund.frm.reportservice;

import org.springframework.beans.factory.annotation.Autowired;

import com.mukund.frm.dao.ReportRepository;
import com.mukund.frm.model.Book;

public class ReportServiceImpl implements ReportService {

	private ReportRepository reportRepo;

	@Autowired
	public void setReportRepo(ReportRepository reportRepo) {
		this.reportRepo = reportRepo;
	}

	@Override
	public void generate(Book book) {
		reportRepo.generate(book);
	}

}
