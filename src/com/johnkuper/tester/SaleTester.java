package com.johnkuper.tester;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.johnkuper.daoimpl.SaleDAOImpl;
import com.johnkuper.domain.SaleDomain;

public class SaleTester {

	final static Logger logger = LoggerFactory.getLogger("JohnKuper");
	SaleDAOImpl saleimpl = new SaleDAOImpl();

	public void findAll() {

		List<SaleDomain> saledomains = saleimpl.findAll();
		for (SaleDomain saledomain : saledomains) {
			logger.debug("Found: {}", saledomain);
		}
	}

}
