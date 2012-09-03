package com.fapiko.faceworm.server;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {

		AbstractApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"com/fapiko/faceworm/server/server.xml");

		FacewormServer facewormServer = applicationContext.getBean("facewormServer", FacewormServer.class);
		facewormServer.applicationLoop();

	}

}
