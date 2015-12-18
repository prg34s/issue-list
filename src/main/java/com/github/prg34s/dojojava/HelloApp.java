package com.github.prg34s.dojojava;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HelloApp {
	private static Logger logger = LoggerFactory.getLogger(HelloApp.class);
	
	public static void main(String[] args) {
		String user = "Daantje";
		System.out.println(getMessage(user));
	}

	public static String getMessage(String user) {
		logger.warn("inside getMessage(" + user+ ")");
		return "Hallo " + user + " <o/";
	}
}
