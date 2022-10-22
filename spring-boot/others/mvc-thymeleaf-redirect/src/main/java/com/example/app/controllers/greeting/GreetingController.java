package com.example.app.controllers.greeting;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.app.commands.greeting.GreetingCommand;


@Controller
public class GreetingController {

	@RequestMapping(value="/greeting", method = RequestMethod.GET)
	public String greeting(@ModelAttribute("command") GreetingCommand command) {		
		return "greeting/greeting";		
	}
	
	@RequestMapping(value="/greeting-redirect", method = RequestMethod.GET)
	public String greetingRedirect(@ModelAttribute("command") GreetingCommand command) {
		return "redirect:greeting-result";
	}
	
	@RequestMapping(value="/greeting-result", method = RequestMethod.GET)
	public String greetingResult(@ModelAttribute("command") GreetingCommand command) {
		
		command.setText("Hello World!");
		return "greeting-result/greeting-result";
		
	}
	
}