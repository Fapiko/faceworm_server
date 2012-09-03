package com.fapiko.faceworm.server.win32;

import com.sun.jna.Native;
import com.sun.jna.win32.W32APIOptions;

public interface User32 extends com.sun.jna.platform.win32.User32 {

	public User32 INSTANCE = (User32) Native.loadLibrary("user32", User32.class, W32APIOptions.DEFAULT_OPTIONS);

	public HWND FindWindow(String className, String windowName);
	public void PostMessage(HWND windowHandle, int message, WPARAM wParam, LPARAM lParam);
	public LRESULT SendMessage(HWND windowHandle, int messageType, WPARAM wParam, LPARAM lParam);

}