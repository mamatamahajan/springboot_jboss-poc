package com.myapps.springbootjboss;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	@RequestMapping("/hello")
	public String helloMsg() {
		return "Hi there, its working";
	}
}
