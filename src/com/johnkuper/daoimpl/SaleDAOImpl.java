package com.johnkuper.daoimpl;

import java.util.List;

import com.johnkuper.daointerface.SaleDAO;
import com.johnkuper.domain.SaleDomain;
import com.johnkuper.entity.Sale;

public class SaleDAOImpl extends GenericDAOImpl<Sale, SaleDomain, Integer>
		implements SaleDAO {

	@Override
	public List<SaleDomain> findWithPaging(int maxresults) {
		return null;
	}

}
