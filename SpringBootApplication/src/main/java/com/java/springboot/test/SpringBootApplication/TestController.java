package com.java.springboot.test.SpringBootApplication;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController {
	@GetMapping("/testing")
	public String tesr() {
		return "hello Spring Boot Application";
	}
	@GetMapping("/add")
	public int add()  {
		int a = 225;
		int b = 335;
		int c = (a+b);
		return c;
	}
}
