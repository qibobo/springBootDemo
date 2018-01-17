package com.qiye.demo.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/hello")
public class SimpleController {

	@RequestMapping(method = RequestMethod.GET)
	public String hello() {
		System.out.println("---------------------here");
		return "hello world";
	}
}
