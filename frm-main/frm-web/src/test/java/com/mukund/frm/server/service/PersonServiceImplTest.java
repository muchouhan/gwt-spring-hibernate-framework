/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package com.mukund.frm.server.service;

import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.doReturn;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import com.mukund.frm.server.domain.Address;
import com.mukund.frm.server.domain.AddressImpl;
import com.mukund.frm.server.domain.Person;
import com.mukund.frm.server.domain.PersonImpl;
import com.mukund.frm.server.exception.CreatePersonException;
import com.mukund.frm.server.repository.AddressRepository;
import com.mukund.frm.server.repository.PersonRepository;

@RunWith(MockitoJUnitRunner.class)
public class PersonServiceImplTest {

	@InjectMocks
	private PersonService personService = new PersonServiceImpl();

	@Mock
	private PersonRepository personRepository;

	@Mock
	private AddressRepository addressRepository;

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testCreateAddressFromPerson() throws CreatePersonException {
		// Prepare
		Person person = new PersonImpl();
		Address address = new AddressImpl();

		doReturn(person).when(personRepository).save((PersonImpl) person);
		doReturn(address).when(addressRepository).save((AddressImpl) address);

		// CUT
		Person createAddressFromPerson = personService
				.createAddressFromPerson(address, person);

		// Asserts
		assertNotNull(createAddressFromPerson);
	}

}
