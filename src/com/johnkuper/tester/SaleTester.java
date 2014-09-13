package com.johnkuper.tester;

import com.johnkuper.daoimpl.SaleDAOImpl;

public class SaleTester {

	SaleDAOImpl saleimpl = new SaleDAOImpl();

	public void findAll(int maxresult) {

		saleimpl.findAll(maxresult);

	}

}
