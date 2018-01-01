/** 
 * Generated by KissMDA - Simple Java Cartridge - kissmda-cartridges-simple-java.
 * KissMDA: http://kissmda.org
 *  
 * DO NOT EDIT this file manually! All changes will be overwritten by next generation!
 *  
 * Generation date: Mon Dec 25 00:44:29 IST 2017.
 */
package com.mukund.frm.server.domain;
import java.util.Collection;
/**
 * This is the Address entity. We save each Address in the database.
 * 
 * @author Lofi Dewanto
 * @version 1.0.0
 * @since 1.0.0
 */
public interface Address {
	Collection<String> getNewAddresses();
	/**
	 * The street of this address.
	 */
	String getStreet();
	/**
	 * The street of this address.
	 */
	void setStreet(String street);
	Person getPerson();
	void setPerson(Person person);
	AddressType getAddressType();
	void setAddressType(AddressType addressType);
	boolean isOld();
	void setOld(boolean old);
}