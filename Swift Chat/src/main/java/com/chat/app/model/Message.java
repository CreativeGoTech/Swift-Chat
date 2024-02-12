package com.chat.app.model;

public class Message {
	
	private String name;  // name of chatter
	private String content;  // content of chatter
	
	
	public Message(String name, String content) {
		super();
		this.name = name;
		this.content = content;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getContent() {
		return content;
	}


	public void setContent(String content) {
		this.content = content;
	}
	
	

}
