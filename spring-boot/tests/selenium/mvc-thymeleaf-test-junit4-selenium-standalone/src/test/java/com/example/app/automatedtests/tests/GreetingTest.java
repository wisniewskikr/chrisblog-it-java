package com.example.app.automatedtests.tests;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.support.PageFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.app.application.Application;
import com.example.app.automatedtests.abstr.AbstractAT;
import com.example.app.automatedtests.pages.GreetingPage;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT, classes = Application.class)
public class GreetingTest extends AbstractAT { 
	
	@LocalServerPort
	protected int port;
	
	@Test
	public void test01() {
		GreetingPage greetingPage = PageFactory.initElements(driver, GreetingPage.class);
		greetingPage
			.open(port)
			.check()
				.title("Hello World")
				.text("Hello World!");
	}

}
