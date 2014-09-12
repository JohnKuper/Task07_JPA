package com.johnkuper.tester;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.johnkuper.daoimpl.CarDAOImpl;
import com.johnkuper.domain.CarDomain;
import com.johnkuper.entity.Car;

public class CarTester {

	CarDAOImpl carimpl = new CarDAOImpl();
	final static Logger logger = LoggerFactory.getLogger("JohnKuper");

	public void create(String name, String model, String modification,
			String color) {

		CarDomain cardomain = new CarDomain(name, model, modification, color);
		carimpl.create(cardomain);
		logger.debug("Test car create: {}", cardomain);
	}

	public void update(int id, String name) {

		CarDomain cardomain = carimpl.findOne(id);
		cardomain.setCar_mark(name);
		carimpl.update(cardomain);
		// logger.debug("Update: {}", cardomain);
	}

	public void findAll() {

		carimpl.findAll();

	}

	public void findOne(int id) {

		CarDomain cardomain = carimpl.findOne(id);
		logger.debug("Found one domain car: {}", cardomain);
	}

	public void delete(int id) {

		carimpl.delete(id);
	}

	public void findByName(String name) {

		List<Car> cars = carimpl.findByName(name);
		for (Car car : cars) {
			logger.debug("Found by name: {}", car);
		}
	}

}
