package com.johnkuper.mapper;

import ma.glasnost.orika.MapperFacade;
import ma.glasnost.orika.MapperFactory;
import ma.glasnost.orika.impl.DefaultMapperFactory;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.johnkuper.domain.CarDomain;
import com.johnkuper.domain.CustomerDomain;
import com.johnkuper.domain.MerchantDomain;
import com.johnkuper.domain.SaleDomain;
import com.johnkuper.domain.StoreDomain;
import com.johnkuper.entity.Car;
import com.johnkuper.entity.Customer;
import com.johnkuper.entity.Merchant;
import com.johnkuper.entity.Sale;
import com.johnkuper.entity.Store;

public class OrikaMapper {

	private MapperFacade orikaFacade;
	final static Logger logger = LoggerFactory.getLogger("JohnKuper");

	public OrikaMapper() {

		MapperFactory mapperFactory = new DefaultMapperFactory.Builder()
				.build();
		registerFields(mapperFactory);
		orikaFacade = mapperFactory.getMapperFacade();
	}

	private void registerFields(MapperFactory factory) {
		logger.debug("--- Start fields registration ---");

		factory.classMap(Car.class, CarDomain.class)
				.field("name", "car_mark")
				.field("model", "car_model")
				.field("modification", "motorpower")
				.field("color", "car_color").byDefault().register();

		factory.classMap(Customer.class, CustomerDomain.class)
				.field("name", "custName").field("surname", "custSurname")
				.field("patronymic", "custPatronymic")
				.field("passport_series", "passportSeries")
				.field("passport_number", "passportNumber")
				.field("birthdate", "dateOfBirth").byDefault().register();

		factory.classMap(Merchant.class, MerchantDomain.class)
				.field("name", "merchName").field("surname", "merchSurname")
				.field("patronymic", "merchPatronymic").byDefault().register();

		factory.classMap(Sale.class, SaleDomain.class)
				.field("price", "salePrice").field("saleDate", "dateOfSale")
				.byDefault().register();

		factory.classMap(Store.class, StoreDomain.class)
				.field("count", "amount").field("price", "carPrice")
				.field("testdrive_avaible", "testDrive").byDefault().register();

		logger.debug("--- Fields registration complete ---");
	}

	public <S, D> D map(S source, Class<D> destinationType) {
		return orikaFacade.map(source, destinationType);
	}

	public <S, D> void map(S source, D destination) {
		orikaFacade.map(source, destination);
	}
}
