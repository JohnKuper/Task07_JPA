package com.johnkuper.main;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MainClass {

	final static Logger logger = LoggerFactory.getLogger("JohnKuper");
	private static TestsExecutor executor = new TestsExecutor();

	public static void main(String[] args) {

		executor.startAllTests();
	}

}
