package com.johnkuper.main;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.johnkuper.tester.CarTester;
import com.johnkuper.tester.SaleTester;
import com.johnkuper.tester.StoreTester;

public class MainClass {

	final static Logger logger = LoggerFactory.getLogger("JohnKuper");

	public static void main(String[] args) {

		//startCarTester();
		 startSaleTester();
		// startStoreTester();
		// OrikaMapper mapper = new OrikaMapper();
		// mapper.runMapper(Car.class, CarDomain.class);

		/*
		 * List<Car> cars = carimpl.findAll(); for (Car car : cars) {
		 * logger.debug("Found : {}", car); }
		 * 
		 * Car onecar = carimpl.findOne(1); logger.debug("Found one car : {}",
		 * onecar);
		 */

		/*
		 * SaleDAOImpl saleimpl = new SaleDAOImpl(); Sale sale =
		 * saleimpl.findOne(1); logger.debug("Found: {}", sale);
		 */
	}

	static void startCarTester() {

		CarTester cartester = new CarTester();
		//cartester.create("Chevrolet", "Corvette", "560hs", "Red");
		cartester.update(2, "Kavasaki");
		cartester.findOne(4);
		cartester.findByName("Lada");
		cartester.delete(1);
		cartester.findAll();
	}

	static void startStoreTester() {

		StoreTester storetester = new StoreTester();
		storetester.findItemsBetweenPrices();
	}

	static void startSaleTester() {

		SaleTester saletester = new SaleTester();
		saletester.findAll();
	}

}
