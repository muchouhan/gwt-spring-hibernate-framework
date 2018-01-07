package com.mukund.frm.model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.function.Predicate;

public class Book implements Cloneable {

	private HierarchyE hierarchy;
	private List<BookAttribute> attributes = new ArrayList<>();
	private List<Book> legacyBooks = new ArrayList<>();
	private List<AltSystem> altSysBooks = new ArrayList<>();

	public Book(HierarchyE hierarchy) {
		this.hierarchy = hierarchy;
	}

	public HierarchyE getHierarchy() {
		return hierarchy;
	}

	public void addAttributes(BookAttribute attribute) {
		this.attributes.add(attribute);
	}

	public void addAllAttributes(Collection<BookAttribute> attributes) {
		this.attributes.addAll(attributes);
	}

	public void addAltSys(AltSystem sys) {
		this.altSysBooks.add(sys);
	}

	public void addAllAltSystem(Collection<AltSystem> sys) {
		this.altSysBooks.addAll(sys);
	}

	public void addLegacyBook(Book legacyBook) {
		this.legacyBooks.add(legacyBook);
	}

	public Book getBookBySTBK(String stbk) {
		return null;
	}

	public BookAttribute getAttributeByName(String name) {
		return (BookAttribute) attributes.stream().filter(new Predicate<BookAttribute>() {
			@Override
			public boolean test(BookAttribute t) {
				return t.getName().equals(name);
			}
		}).distinct();
	}

	public List<BookAttribute> getAttributeByType(AttributeTypeE type) {
		return (List<BookAttribute>) attributes.stream().filter(new Predicate<BookAttribute>() {
			@Override
			public boolean test(BookAttribute t) {
				return t.getType().equals(type);
			}
		});
	}

	public List<Book> getBookByType(HierarchyE hierarchy) {
		return (List<Book>) legacyBooks.stream().filter(new Predicate<Book>() {
			@Override
			public boolean test(Book t) {
				return t.getHierarchy().equals(hierarchy);
			}
		});
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

}
