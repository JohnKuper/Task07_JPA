package com.johnkuper.main;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.johnkuper.domain.CarDomain;
import com.johnkuper.entity.Car;
import com.johnkuper.mapper.OrikaMapper;
import com.johnkuper.tester.CarTester;
import com.johnkuper.tester.StoreTester;

public class MainClass {

	final static Logger logger = LoggerFactory.getLogger("JohnKuper");

	public static void main(String[] args) {

		// startCarTester();
		// startStoreTester();
		OrikaMapper mapper = new OrikaMapper();
		//mapper.runMapper(Car.class, CarDomain.class);

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
		// cartester.create("Chevrolet", "Corvette", "560hs", "Red");
		// cartester.update(1, "Honda");
		cartester.findAll();
		cartester.findOne(6);
		cartester.findByName("Audi");
		// cartester.delete(1);
	}

	static void startStoreTester() {

		StoreTester storetester = new StoreTester();
		storetester.findItemsBetweenPrices();
	}

}
