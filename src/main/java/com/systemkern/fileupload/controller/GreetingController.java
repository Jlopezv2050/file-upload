package com.systemkern.fileupload.controller;


import org.springframework.web.bind.annotation.*;


@RestController
public class GreetingController {


	@GetMapping("/hello")
	public String sayHello() {

		System.out.println(System.getProperty("java.io.tmpdir"));
		return "Hello Juan!!";
	}
}
