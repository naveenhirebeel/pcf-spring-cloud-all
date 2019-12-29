package com.self.clientconfig.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class Welcome {

	@Value("${msg: Default Message}")
	private String msg;
	
	@GetMapping
	public String greet() {
		return msg;
	}
	
}
