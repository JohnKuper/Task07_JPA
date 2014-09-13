package com.johnkuper.tester;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.johnkuper.daoimpl.CarDAOImpl;
import com.johnkuper.domain.CarDomain;

public class CarTester {

	CarDAOImpl carimpl = new CarDAOImpl();
	final static Logger logger = LoggerFactory.getLogger("JohnKuper");

	public void create(String name, String model, String modification,
			String color) {

		CarDomain cardomain = new CarDomain(name, model, modification, color);
		carimpl.create(cardomain);
	}

	public void update(int id, String name) {

		CarDomain cardomain = carimpl.findOne(id);
		logger.debug("Domain for update: {}", cardomain);
		cardomain.setCar_mark(name);
		carimpl.update(cardomain);
	}

	public void findAll() {

		carimpl.findAll();

	}

	public void findOne(int id) {

		carimpl.findOne(id);
	}

	public void delete(int id) {

		carimpl.delete(id);
	}

	public void findByName(String name) {

		carimpl.findByName(name);
	}

}
