package com.johnkuper.tester;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.johnkuper.daoimpl.CarDAOImpl;
import com.johnkuper.entity.Car;

public class CarTester {

	CarDAOImpl carimpl = new CarDAOImpl();
	final static Logger logger = LoggerFactory.getLogger("JohnKuper");

	public void create(String name, String model, String modification,
			String color) {

		Car car = new Car(name, model, modification, color);
		carimpl.create(car);
		logger.debug("Create: {}", car);
	}

	public void update(int id, String name) {

		Car car = carimpl.findOne(id);
		car.setName(name);
		carimpl.update(car);
		logger.debug("Update: {}", car);
	}

	public void findAll() {

		List<Car> cars = carimpl.findAll();
		for (Car car : cars) {
			logger.debug("Found: {}", car);
		}
	}

	public void findOne(int id) {

		Car car = carimpl.findOne(id);
		logger.debug("Found one car : {}", car);
	}

	public void delete(int id) {

		Car car = carimpl.delete(1);
		logger.debug("Deleted: {}", car);
	}

	public void findByName(String name) {

		List<Car> cars = carimpl.findByName(name);
		for (Car car : cars) {
			logger.debug("Found by name: {}", car);
		}
	}

}
