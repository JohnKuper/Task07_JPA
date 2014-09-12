package com.johnkuper.daoimpl;

import java.util.List;

import javax.persistence.TypedQuery;

import com.johnkuper.daointerface.CustomerDAO;
import com.johnkuper.domain.CustomerDomain;
import com.johnkuper.entity.Customer;

public class CustomerDAOImpl extends
		GenericDAOImpl<Customer, CustomerDomain, Integer> implements
		CustomerDAO {

	@Override
	public List<Customer> findBySurname(String surname) {

		TypedQuery<Customer> query = entityManager.createQuery(
				"SELECT c FROM Customer c WHERE c.surname = :surname",
				Customer.class);
		query.setParameter("surname", surname);
		return query.getResultList();

	}

}
