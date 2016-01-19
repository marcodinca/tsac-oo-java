package com.microsoft.winme.test.model.ui;

import static org.junit.Assert.*;

import org.junit.Test;

import com.microsoft.winme.model.ui.User;

public class UserTest {

	@Test
	public void testGetName() {
		User u = new User();
		u.setName("prova");
		assertEquals("prova", u.getName());
	}

}

