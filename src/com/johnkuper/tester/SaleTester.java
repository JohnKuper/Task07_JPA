package com.johnkuper.tester;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.johnkuper.daoimpl.SaleDAOImpl;

public class SaleTester {

	final static Logger logger = LoggerFactory.getLogger("JohnKuper");
	SaleDAOImpl saleimpl = new SaleDAOImpl();

	public void findAll() {

		saleimpl.findAll();

	}

}
