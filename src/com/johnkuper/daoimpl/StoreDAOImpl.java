package com.johnkuper.daoimpl;

import java.math.BigDecimal;
import java.util.List;

import javax.persistence.TypedQuery;

import com.johnkuper.daointerface.StoreDAO;
import com.johnkuper.entity.Store;

public class StoreDAOImpl extends GenericDAOImpl<Store, Integer> implements
		StoreDAO {

	@Override
	public List<Store> findItemsBetweenPrices(BigDecimal minprice,
			BigDecimal maxprice) {

		TypedQuery<Store> query = entityManager
				.createQuery(
						"SELECT s FROM Store s WHERE s.price BETWEEN :minprice AND :maxprice",
						Store.class);
		query.setParameter("minprice", minprice);
		query.setParameter("maxprice", maxprice);
		return query.getResultList();
	}

}
