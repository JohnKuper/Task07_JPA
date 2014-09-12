package com.johnkuper.tester;

import java.math.BigDecimal;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.johnkuper.daoimpl.StoreDAOImpl;
import com.johnkuper.entity.Store;

public class StoreTester {

	StoreDAOImpl storeimpl = new StoreDAOImpl();
	final static Logger logger = LoggerFactory.getLogger("JohnKuper");

	public void findItemsBetweenPrices() {
		BigDecimal minprice = new BigDecimal("300000.50");
		BigDecimal maxprice = new BigDecimal("1000000.50");
		List<Store> items = storeimpl
				.findItemsBetweenPrices(minprice, maxprice);
		for (Store item : items) {
			logger.debug("Found items between price: {}", item);
		}
	}

} 
