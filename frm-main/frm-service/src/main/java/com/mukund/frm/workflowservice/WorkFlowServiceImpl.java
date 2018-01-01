package com.mukund.frm.workflowservice;

import org.springframework.beans.factory.annotation.Autowired;

import com.mukund.frm.dao.WorkFlowRepository;
import com.mukund.frm.model.Book;

public class WorkFlowServiceImpl implements WorkFlowService {

	private WorkFlowRepository workflowRepo;

	@Autowired
	public void setWorkflowRepo(WorkFlowRepository workflowRepo) {
		this.workflowRepo = workflowRepo;
	}

	@Override
	public void update(Book book) {
		workflowRepo.update(book);
	}

}
