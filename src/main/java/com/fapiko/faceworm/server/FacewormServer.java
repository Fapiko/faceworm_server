package com.fapiko.faceworm.server;

import com.sun.jna.platform.win32.User32;
import com.sun.jna.platform.win32.WinDef;
import com.sun.jna.platform.win32.WinDef.HWND;
import com.sun.jna.platform.win32.WinUser;

public class FacewormServer {

	public void applicationLoop() {

		HWND pandoraHandle = User32.INSTANCE.FindWindow(null, "Pandora");
		User32.INSTANCE.PostMessage(pandoraHandle, WinUser.WM_KEYUP, new WinDef.WPARAM(0x20), new WinDef.LPARAM(0));

	}

}
