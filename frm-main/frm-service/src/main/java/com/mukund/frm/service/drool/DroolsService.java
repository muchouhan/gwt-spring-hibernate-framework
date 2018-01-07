package com.mukund.frm.service.drool;

import com.mukund.frm.model.DroolsBookFacts;

public interface DroolsService {

	void initialize();

	DroolsBookFacts execute(DroolsBookFacts b);

}
