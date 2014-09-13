package com.johnkuper.daointerface;

import com.johnkuper.domain.CustomerDomain;
import com.johnkuper.entity.Customer;

public interface CustomerDAO extends
		GenericDAO<Customer, CustomerDomain, Integer> {


}
