package com.johnkuper.main;

import com.johnkuper.tester.CarTester;
import com.johnkuper.tester.SaleTester;
import com.johnkuper.tester.StoreTester;

public class TestsExecutor {

	private CarTester carTester = new CarTester();
	private SaleTester saleTester = new SaleTester();
	private StoreTester storeTester = new StoreTester();

	public void startAllTests() {

		startCarTester();
		startSaleTester();
		startStoreTester();

	}

	private void startCarTester() {

		carTester.create("Chevrolet", "Corvette", "560hs", "Red");
		carTester.update(2, "Kavasaki");
		carTester.findOne(4);
		carTester.findByName("Lada");
		carTester.delete(1);
		carTester.findAll();
	}

	private void startSaleTester() {

		storeTester.findItemsBetweenPrices();
		storeTester.findAll(10);
	}

	private void startStoreTester() {

		saleTester.findAll(10);
	}
}