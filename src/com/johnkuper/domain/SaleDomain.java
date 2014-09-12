package com.johnkuper.domain;

import java.math.BigDecimal;
import java.util.Date;

import com.johnkuper.entity.Car;
import com.johnkuper.entity.Customer;
import com.johnkuper.entity.Merchant;

public class SaleDomain {

	public int id; // id
	public Car car; //
	public Customer customer;
	public Merchant merchant;
	public BigDecimal salePrice; // price
	public Date dateOfSale; // saleDate

	public SaleDomain() {
	}

	public SaleDomain(int id, Car car, Customer customer, Merchant merchant,
			BigDecimal salePrice, Date dateOfSale) {
		this.id = id;
		this.car = car;
		this.customer = customer;
		this.merchant = merchant;
		this.salePrice = salePrice;
		this.dateOfSale = dateOfSale;
	}
	
	@Override
	public String toString() {
		return "SaleDomain: {id = " + id +
				"; salePrice = " + salePrice +
				"; dateOfSale = " + dateOfSale +
				"%n" + car +
				"%n" + customer +
				"%n" + merchant + "}%n";
	}
	
	



}
