package com.johnkuper.domainfromdao;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.johnkuper.daoimpl.CarDAOImpl;
import com.johnkuper.domain.CarDomain;

public class CarDomainFromDAO {

	final static Logger logger = LoggerFactory.getLogger("JohnKuper");
	CarDAOImpl carimpl = new CarDAOImpl();

}
