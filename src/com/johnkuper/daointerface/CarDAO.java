package com.johnkuper.daointerface;

import java.util.List;

import com.johnkuper.entity.Car;

public interface CarDAO extends GenericDAO<Car, Integer> {

	List<Car> findByName(String name);

}
