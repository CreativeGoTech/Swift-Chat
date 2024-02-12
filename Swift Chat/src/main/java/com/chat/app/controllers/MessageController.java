package com.chat.app.controllers;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.chat.app.model.Message;

@RestController
public class MessageController {

	
	@MessageMapping("/message")//all the clients will send message on this url
	@SendTo("/topic/return-to")// message will return to those who have subscribed on this url
	public Message getContent(@RequestBody Message message)// this will return same message of client to all clients
	{
		
		try //take wait to send mess after 2 secs
		{ //processing
			Thread.sleep(2000);
			
		}catch (InterruptedException e)
		{
			e.printStackTrace();
		}
		
		return message; // after 2 sec mss will be return
	}
}
