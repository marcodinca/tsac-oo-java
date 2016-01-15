package com.microsoft.winme.client.ui;

import com.microsoft.winme.model.ui.User;
//import com.microsoft.winme.server.ui.Window; conflict

public class Window {

	public static void main(String[] args){
		
		com.microsoft.winme.server.ui.Window w = new com.microsoft.winme.server.ui.Window();
		
		com.microsoft.winme.model.ui.User user1 = new com.microsoft.winme.model.ui.User();
		user1.setName("Bill");
		user1.setSurname("Cancelli");
		
		//
		User user2 = new User();
		user2.setName("A");
		user2.setSurname("B");
		
		System.out.println(user1.getSurname());
	}
	
}
