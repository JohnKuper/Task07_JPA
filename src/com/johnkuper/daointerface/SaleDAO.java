package com.johnkuper.daointerface;

import java.util.List;

import com.johnkuper.domain.SaleDomain;
import com.johnkuper.entity.Sale;

public interface SaleDAO extends GenericDAO<Sale, SaleDomain, Integer> {

	List<SaleDomain> findWithPaging(int maxresults);

}
