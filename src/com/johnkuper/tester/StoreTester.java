package com.johnkuper.tester;

import java.math.BigDecimal;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.johnkuper.daoimpl.StoreDAOImpl;

public class StoreTester {

	StoreDAOImpl storeimpl = new StoreDAOImpl();
	final static Logger logger = LoggerFactory.getLogger("JohnKuper");

	public void findItemsBetweenPrices() {
		BigDecimal minprice = new BigDecimal("100000.00");
		BigDecimal maxprice = new BigDecimal("300000.00");
		storeimpl.findItemsBetweenPrices(minprice, maxprice);

	}

}
