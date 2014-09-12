package com.johnkuper.mapper;

import ma.glasnost.orika.MapperFacade;
import ma.glasnost.orika.MapperFactory;
import ma.glasnost.orika.impl.DefaultMapperFactory;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.johnkuper.daoimpl.CarDAOImpl;
import com.johnkuper.domain.CarDomain;
import com.johnkuper.entity.Car;

public class EntityToDomainMapper {

	final static Logger logger = LoggerFactory.getLogger("JohnKuper");
	CarDAOImpl carimpl = new CarDAOImpl();

	private void configureFactory(Class<?> sourceClass, Class<?> destiClass) {

		MapperFactory mapperFactory = new DefaultMapperFactory.Builder()
				.build();

		mapperFactory.classMap(sourceClass, destiClass).field("id", "id")
				.field("name", "car_mark").field("model", "car_model")
				.field("modification", "motorpower")
				.field("color", "car_color").byDefault().register();
		configureFacade(mapperFactory);
	}

	private void configureFacade(MapperFactory factory) {

		MapperFacade mapper = factory.getMapperFacade();
		Car car = carimpl.findOne(2);
		CarDomain cardomain = mapper.map(car, CarDomain.class);
		logger.debug("Source data: {}, Domain data: {}", car, cardomain);
		cardomain.setCar_mark("Suzuki");
		Car newcar = mapper.map(cardomain, Car.class);
		logger.debug("New entity data {}", newcar);
		carimpl.update(newcar);

	}

	public void runMapper(Class<?> sourceClass, Class<?> destiClass) {
		configureFactory(sourceClass, destiClass);
	}

}
