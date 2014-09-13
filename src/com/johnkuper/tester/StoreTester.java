package com.johnkuper.tester;

import java.math.BigDecimal;

import com.johnkuper.daoimpl.StoreDAOImpl;

public class StoreTester {

	StoreDAOImpl storeimpl = new StoreDAOImpl();

	public void findItemsBetweenPrices() {
		BigDecimal minprice = new BigDecimal("100000.00");
		BigDecimal maxprice = new BigDecimal("300000.00");
		storeimpl.findItemsBetweenPrices(minprice, maxprice);

	}

	public void findAll(int maxresult) {

		storeimpl.findAll(maxresult);
	}

}
