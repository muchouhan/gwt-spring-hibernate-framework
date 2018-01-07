package com.mukund.frm.model.metadata;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.function.Predicate;

import com.mukund.frm.model.AttributeTypeE;
import com.mukund.frm.model.HierarchyE;

public class BookMetaData implements Cloneable {

	private HierarchyE hierarchy;
	private List<BookAttributeMetaData> attributes = new ArrayList<>();
	private List<BookMetaData> legacyBooks = new ArrayList<>();
	private List<AltSystemMetaData> altSysBooks = new ArrayList<>();

	public BookMetaData(HierarchyE hierarchy) {
		this.hierarchy = hierarchy;
	}

	public HierarchyE getHierarchy() {
		return hierarchy;
	}

	public void addAttributes(BookAttributeMetaData attribute) {
		this.attributes.add(attribute);
	}

	public void addAllAttributes(Collection<BookAttributeMetaData> attributes) {
		this.attributes.addAll(attributes);
	}

	public void addAltSys(AltSystemMetaData sys) {
		this.altSysBooks.add(sys);
	}

	public void addAllAltSystem(Collection<AltSystemMetaData> sys) {
		this.altSysBooks.addAll(sys);
	}

	public void addLegacyBook(BookMetaData legacyBook) {
		this.legacyBooks.add(legacyBook);
	}

	public BookAttributeMetaData getAttributeByName(String name) {
		return (BookAttributeMetaData) attributes.stream().filter(new Predicate<BookAttributeMetaData>() {
			@Override
			public boolean test(BookAttributeMetaData t) {
				return t.getName().equals(name);
			}
		}).distinct();
	}

	public BookMetaData getBookByType(HierarchyE hierarchy) {
		return (BookMetaData) legacyBooks.stream().filter(new Predicate<BookMetaData>() {
			@Override
			public boolean test(BookMetaData t) {
				return t.getHierarchy().equals(hierarchy);
			}
		}).distinct();
	}
	
	public AltSystemMetaData getAltSysByName(String name) {
		return (AltSystemMetaData) altSysBooks.stream().filter(new Predicate<AltSystemMetaData>() {
			@Override
			public boolean test(AltSystemMetaData t) {
				return t.getName().equals(name);
			}
		}).distinct();
	}


	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

}
