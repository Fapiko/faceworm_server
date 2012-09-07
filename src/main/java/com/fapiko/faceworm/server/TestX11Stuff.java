package com.fapiko.faceworm.server;

import com.sun.jna.Pointer;
import com.sun.jna.platform.unix.X11;
import com.sun.jna.ptr.IntByReference;
import com.sun.jna.ptr.PointerByReference;
import org.apache.log4j.Logger;

public class TestX11Stuff {

	private static Logger logger = Logger.getLogger(App.class);

	public TestX11Stuff() {
		X11 x11 = X11.INSTANCE;

		X11.Display display = x11.XOpenDisplay(null);

		int screen = x11.XDefaultScreen(display);
		X11.Window root = x11.XRootWindow(display, screen);

		X11.WindowByReference rootReturn = new X11.WindowByReference();
		X11.WindowByReference parentReturn = new X11.WindowByReference();
		PointerByReference childReturn = new PointerByReference();
		IntByReference numChildrenReturn = new IntByReference();

		int queryTree = x11.XQueryTree(display, root, rootReturn, parentReturn,
				childReturn, numChildrenReturn);

		logger.info(queryTree);
		logger.info(rootReturn);
		logger.info(parentReturn.getValue());
		logger.info(childReturn.getValue());
		logger.info(numChildrenReturn.getValue());

		Pointer p = childReturn.getValue();
		logger.info(p);

		X11.XTextProperty windowName = new X11.XTextProperty();
		x11.XGetWMName(display, parentReturn.getValue(), windowName);

		logger.info(windowName.value);

	}

}