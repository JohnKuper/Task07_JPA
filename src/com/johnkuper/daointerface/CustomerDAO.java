package com.johnkuper.daointerface;

import java.util.List;

import com.johnkuper.domain.CustomerDomain;
import com.johnkuper.entity.Customer;

public interface CustomerDAO extends
		GenericDAO<Customer, CustomerDomain, Integer> {

	List<Customer> findBySurname(String surname);

}
