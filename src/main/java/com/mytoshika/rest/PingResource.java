package com.mytoshika.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PingResource {

	@GetMapping(value = "/ping")
	public String createNewUser() {

		return "success";
	}

}
