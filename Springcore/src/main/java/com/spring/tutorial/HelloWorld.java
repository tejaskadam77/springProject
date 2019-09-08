package com.spring.tutorial;

public class HelloWorld {
	String message;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	void sendMessage()
	{
		System.out.println(this.message);
	}

}
