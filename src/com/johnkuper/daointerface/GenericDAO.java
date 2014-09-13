package com.johnkuper.daointerface;

import java.util.List;

public interface GenericDAO<Entity, Domain, IdType> {

	void create(Domain domain);

	void update(Domain domain);

	List<Domain> findAll();

	List<Domain> findAll(IdType limit);

	Domain findOne(IdType id);

	void delete(IdType id);

}
