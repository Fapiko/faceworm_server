package com.fapiko.faceworm.server;

import com.sun.jna.Native;
import com.sun.jna.platform.win32.User32;
import com.sun.jna.platform.win32.WinDef.HWND;
import com.sun.jna.win32.W32APIOptions;

public class FacewormServer {

	public void applicationLoop() {

		HWND hwnd = User32.INSTANCE.FindWindow(null, "Trillian");

		System.out.println(hwnd.toString());

		System.out.println("face");

	}

}
