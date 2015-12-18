package com.github.prg34s.dojojava;

import static org.junit.Assert.*;

import org.junit.Test;

import com.github.prg34s.dojojava.HelloApp;

public class HelloAppTest {

	@Test
	public void testGetMessage() {
		assertEquals("Hallo Daantje <o/", HelloApp.getMessage("Daantje"));
	}

}
