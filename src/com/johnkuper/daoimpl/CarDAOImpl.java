package com.johnkuper.daoimpl;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.TypedQuery;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.johnkuper.daointerface.CarDAO;
import com.johnkuper.domain.CarDomain;
import com.johnkuper.entity.Car;

public class CarDAOImpl extends GenericDAOImpl<Car, CarDomain, Integer>
		implements CarDAO {

	final static Logger logger = LoggerFactory.getLogger("JohnKuper");

	@Override
	public List<CarDomain> findByName(String name) {

		logger.debug("--- Start 'findByName' method for Car entity");

		TypedQuery<Car> query = entityManager.createQuery(
				"SELECT c FROM Car c WHERE c.name = :name", Car.class);
		query.setParameter("name", name);
		List<Car> cars = query.getResultList();
		List<CarDomain> cardomains = new ArrayList<CarDomain>();
		if (cars.size() != 0) {
			for (Car car : cars) {
				cardomains.add(mapper.map(car, CarDomain.class));
				logger.debug("Found by name: {}", car);
			}
		}
		return cardomains;
	}

}
