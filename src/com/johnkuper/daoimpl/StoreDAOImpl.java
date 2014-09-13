package com.johnkuper.daoimpl;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.TypedQuery;

import com.johnkuper.daointerface.StoreDAO;
import com.johnkuper.domain.StoreDomain;
import com.johnkuper.entity.Store;

public class StoreDAOImpl extends GenericDAOImpl<Store, StoreDomain, Integer>
		implements StoreDAO {

	@Override
	public List<StoreDomain> findItemsBetweenPrices(BigDecimal minprice,
			BigDecimal maxprice) {
		
		logger.debug("--- Start 'findItemsBetweenPrices' method for Store entity --- ");

		TypedQuery<Store> query = entityManager
				.createQuery(
						"SELECT s FROM Store s WHERE s.price BETWEEN :minprice AND :maxprice",
						Store.class);
		query.setParameter("minprice", minprice);
		query.setParameter("maxprice", maxprice);
		List<Store> items = query.getResultList();
		List<StoreDomain> domainitems = new ArrayList<StoreDomain>();
		logger.debug("--- {} Items between {} and {} prices was found ---",
				items.size(), minprice, maxprice);
		if (items.size() > 0) {
			for (Store item : items) {
				domainitems.add(mapper.map(item, StoreDomain.class));
				logger.debug("{}", item);
			}
		}
		return domainitems;
	}
	

}
