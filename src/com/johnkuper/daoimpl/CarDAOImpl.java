package com.johnkuper.daoimpl;

import java.util.List;

import javax.persistence.TypedQuery;

import com.johnkuper.daointerface.CarDAO;
import com.johnkuper.entity.Car;

public class CarDAOImpl extends GenericDAOImpl<Car, Integer> implements CarDAO {

	@Override
	public List<Car> findByName(String name) {

		TypedQuery<Car> query = entityManager.createQuery(
				"SELECT c FROM Car c WHERE c.name = :name", Car.class);
		query.setParameter("name", name);
		return query.getResultList();
	}

}
