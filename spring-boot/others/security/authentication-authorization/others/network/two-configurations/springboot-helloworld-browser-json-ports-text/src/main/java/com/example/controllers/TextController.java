package com.example.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.jsons.TextJson;

@RestController
public class TextController {
	
private Environment environment;	
	
	@Autowired
	public TextController(Environment environment) {
		this.environment = environment;
	}

	@RequestMapping(value="/apikey")
	public TextJson helloWorldApiKey() {
		
		String port = environment.getProperty("local.server.port");
		return new TextJson("Hello World (API Key Authentication)!", port);
		
	}
	
	@RequestMapping(value="/basic")
	public TextJson helloWorldBasic() {
		
		String port = environment.getProperty("local.server.port");
		return new TextJson("Hello World (Basic Authentication)!", port);
		
	}
	
}