package com.johnkuper.daointerface;

import java.util.List;

import com.johnkuper.domain.CarDomain;
import com.johnkuper.entity.Car;

public interface CarDAO extends GenericDAO<Car, CarDomain, Integer> {

	List<Car> findByName(String name);

}
