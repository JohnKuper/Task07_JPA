package com.johnkuper.main;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.johnkuper.daoimpl.SaleDAOImpl;
import com.johnkuper.entity.Sale;

public class MainClass {

	final static Logger logger = LoggerFactory.getLogger("JohnKuper");

	public static void main(String[] args) {

		/*
		 * CarDAOImpl carimpl = new CarDAOImpl();
		 * 
		 * List<Car> cars = carimpl.findAll(); for (Car car : cars) {
		 * logger.debug("Found : {}", car); }
		 * 
		 * Car onecar = carimpl.findOne(1); logger.debug("Found one car : {}",
		 * onecar);
		 */

		SaleDAOImpl saleimpl = new SaleDAOImpl();
		Sale sale = saleimpl.findOne(1);
		logger.debug("Found: {}", sale);
	}

}
