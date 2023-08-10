package com.jp.security.SpringSecurityTesting.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
	@GetMapping("/")
	public String greeting() {
		return "home1";
	}

	@GetMapping("/login")
	public String login() {
		return "login";
	}
}
