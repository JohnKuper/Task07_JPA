package com.johnkuper.daointerface;

import java.util.List;

import com.johnkuper.entity.Customer;

public interface CustomerDAO extends GenericDAO<Customer, Integer> {

	List<Customer> findBySurname(String surname);

}
