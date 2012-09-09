package com.fapiko.faceworm.server;

import com.sun.jna.Pointer;
import com.sun.jna.platform.unix.X11;
import com.sun.jna.ptr.IntByReference;
import com.sun.jna.ptr.PointerByReference;
import org.apache.log4j.Logger;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.security.PublicKey;

public class App {

	private static Logger logger = Logger.getLogger(App.class);

	public static void main(String[] args) {

		AbstractApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"com/fapiko/faceworm/server/server.xml");

		FacewormServer facewormServer = applicationContext.getBean("facewormServer", FacewormServer.class);
		facewormServer.applicationLoop();

//		TestX11Stuff test = new TestX11Stuff();

	}

}

