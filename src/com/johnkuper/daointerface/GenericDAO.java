package com.johnkuper.daointerface;

import java.util.List;

public interface GenericDAO<Model, IdType> {

	void create(Model entity);

	Model update(Model entity);

	List<Model> findAll();

	Model findOne(IdType id);

	Model delete(IdType id);

}
