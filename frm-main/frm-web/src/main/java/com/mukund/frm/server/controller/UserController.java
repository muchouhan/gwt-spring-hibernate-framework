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
package com.mukund.frm.server.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.mukund.frm.server.service.UserService;
import com.mukund.frm.shared.DemoGwtServiceEndpoint;
import com.mukund.frm.shared.UserDto;

@Controller
public class UserController {

	@Autowired
	private UserService userService;

	@RequestMapping(value = DemoGwtServiceEndpoint.LOGIN_USER, method = RequestMethod.GET)
	public @ResponseBody UserDto getLoginUser() {
		String loginUser = userService.getLoginUser();

		UserDto userDto = buildUser(loginUser);

		return userDto;
	}

	private UserDto buildUser(String loginUser) {
		UserDto userDto = new UserDto();
		userDto.setName(loginUser);
		return userDto;
	}
}
