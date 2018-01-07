package com.mukund.frm.service.metadata;

import com.mukund.frm.model.metadata.BookMetaData;

public interface MetaDataService {

	void initialize();

	BookMetaData fetchBookMetaData();
	
}
