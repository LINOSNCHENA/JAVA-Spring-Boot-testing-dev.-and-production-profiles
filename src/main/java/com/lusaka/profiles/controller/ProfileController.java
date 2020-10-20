package com.lusaka.profiles.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProfileController {

	@Value("${app.message}")
	private String profileDetails;

	@GetMapping("/")
	public String getDataBaseConnectionDetails() {
		return profileDetails;
	}
}
