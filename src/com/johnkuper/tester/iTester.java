package com.johnkuper.tester;

public interface iTester<DaoImpl,Domain> {
	
	void findAll();
	void findOne();
	void delete();

}
