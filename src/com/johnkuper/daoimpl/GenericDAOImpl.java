package com.johnkuper.daoimpl;

import java.lang.reflect.ParameterizedType;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.johnkuper.daointerface.GenericDAO;

public class GenericDAOImpl<Model, IdType> implements GenericDAO<Model, IdType> {

	protected EntityManager entityManager;

	protected Class<Model> entityType;

	final static Logger logger = LoggerFactory.getLogger("JohnKuper");

	@SuppressWarnings("unchecked")
	public GenericDAOImpl() {
		this.entityType = (Class<Model>) ((ParameterizedType) getClass()
				.getGenericSuperclass()).getActualTypeArguments()[0];
		getEntityManager();

	}

	private void getEntityManager() {

		EntityManagerFactory emf = Persistence
				.createEntityManagerFactory("AutoShowDataBase");
		entityManager = emf.createEntityManager();
	}

	@Override
	public void create(Model entity) {
		logger.debug("--- Start 'create' method for {} entity ---",
				entityType.getSimpleName());
		entityManager.getTransaction().begin();
		entityManager.persist(entity);
		entityManager.getTransaction().commit();

	}

	@Override
	public Model update(Model entity) {
		logger.debug("--- Start 'update' method for {} entity ---",
				entityType.getSimpleName());
		entityManager.getTransaction().begin();
		entityManager.merge(entity);
		entityManager.getTransaction().commit();
		return entity;
	}

	@Override
	@SuppressWarnings("unchecked")
	public List<Model> findAll() {
		logger.debug("--- Start 'findAll' method for {} entity ---",
				entityType.getSimpleName());
		Query query = entityManager.createQuery("SELECT entity FROM "
				+ entityType.getName() + " entity");
		return query.getResultList();
	}

	@Override
	public Model findOne(IdType id) {
		logger.debug("--- Start 'findOne' method for {} entity ---",
				entityType.getSimpleName());
		return entityManager.find(entityType, id);
	}

	@Override
	public Model delete(IdType id) {
		logger.debug("--- Start 'delete' method for {} entity ---",
				entityType.getSimpleName());
		Model entity = findOne(id);
		entityManager.getTransaction().begin();
		entityManager.remove(entity);
		entityManager.getTransaction().commit();
		return entity;
	}

}
