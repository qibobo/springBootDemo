package com.qiye.demo.web;

import org.apache.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/v2")
public class SimpleController {

	Logger logger = Logger.getLogger(this.getClass());
	@RequestMapping(method = RequestMethod.GET)
	public String hello() {
		logger.info("-------------hello world");
		System.out.println("---------------------here");
		return "hello world";
	}
}
