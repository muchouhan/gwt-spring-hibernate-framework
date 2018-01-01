package com.mukund.frm.model;

import java.io.Serializable;
import java.util.Collections;
import java.util.List;

public class Book implements Serializable {

	private StructureE structure;
	private BookLevelE level;
	private List<BookAttribute> attributes = Collections.emptyList();
	private List<Book> legacyBook = Collections.emptyList();

	
	public void addLegacyBook(Book book) {
		legacyBook.add(book);
	}

	public void addAttribute(BookAttribute attr) {
		attributes.add(attr);
	}

	public void addAllAttribute(List<BookAttribute> attr) {
		attributes.addAll(attr);
	}

	public BookAttribute getAttributeByName(String name) {
		return null;
	}

	public Book getBookBySTBK(String name) {
		return null;
	}

	public List<Book> getBooksByStructure(StructureE name) {
		return null;
	}

	public Book getBookBySegnowCode(String name) {
		return null;
	}

}
