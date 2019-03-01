package com.lyj.sample.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {

	@RequestMapping("/hello.do")
	public String sayHello() {
		return "Hello! We'll rock you!";
	}
}
