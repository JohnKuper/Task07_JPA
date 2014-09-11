package com.johnkuper.daoimpl;

import java.lang.reflect.ParameterizedType;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.johnkuper.daointerface.GenericDAO;

public class GenericDAOImpl<Model, IdType> implements GenericDAO<Model, IdType> {

	protected EntityManager entityManager;

	protected Class<Model> entityType;

	@SuppressWarnings("unchecked")
	public GenericDAOImpl() {
		this.entityType = (Class<Model>) ((ParameterizedType) getClass()
				.getGenericSuperclass()).getActualTypeArguments()[0];
		setupEntityManager();

	}

	private void setupEntityManager() {

		EntityManagerFactory emf = Persistence
				.createEntityManagerFactory("AutoShowDataBase");
		entityManager = emf.createEntityManager();
	}

	@Override
	public void create(Model entity) {
		entityManager.persist(entity);

	}

	@Override
	public Model update(Model entity) {
		return entityManager.merge(entity);
	}

	@Override
	@SuppressWarnings("unchecked")
	public List<Model> findAll() {
		Query query = entityManager.createQuery("SELECT entity FROM "
				+ entityType.getName() + " entity");
		return query.getResultList();
	}

	@Override
	public Model findOne(IdType id) {
		return entityManager.find(entityType, id);
	}

	@Override
	public Model delete(IdType id) {
		Model entity = findOne(id);
		entityManager.remove(entity);
		return entity;
	}

}
