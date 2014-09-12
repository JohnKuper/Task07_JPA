package com.johnkuper.daointerface;

import java.math.BigDecimal;
import java.util.List;

import com.johnkuper.domain.StoreDomain;
import com.johnkuper.entity.Store;

public interface StoreDAO extends GenericDAO<Store,StoreDomain,Integer> {

	List<Store> findItemsBetweenPrices(BigDecimal maxprice, BigDecimal minprice);

}
