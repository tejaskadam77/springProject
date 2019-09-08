package com.spring.tutorial;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	private static ApplicationContext a;

	public static void main(String[] args) {
		a = new ClassPathXmlApplicationContext("beans.xml");
		HelloWorld h=(HelloWorld) a.getBean("helloWorld");
		h.sendMessage();
	}

}
