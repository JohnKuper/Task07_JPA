package com.johnkuper.domain;

import java.math.BigDecimal;
import java.util.Date;

import com.johnkuper.entity.Car;
import com.johnkuper.entity.Customer;
import com.johnkuper.entity.Merchant;

public class SaleDomain {

	private int id; // id
	private Car car; //
	private Customer customer;
	private Merchant merchant;
	private BigDecimal salePrice; // price
	private Date dateOfSale; // saleDate

	public SaleDomain() {
	}

	public SaleDomain(Car car, Customer customer, Merchant merchant,
			BigDecimal salePrice, Date dateOfSale) {
		this.car = car;
		this.customer = customer;
		this.merchant = merchant;
		this.salePrice = salePrice;
		this.dateOfSale = dateOfSale;
	}

	@Override
	public String toString() {
		return String.format("SaleDomain: {id = " + id + "; salePrice = "
				+ salePrice + "; dateOfSale = " + dateOfSale + "%n" + car
				+ "%n" + customer + "%n" + merchant + "%n");
	}

	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Car getCar() {
		return car;
	}

	public void setCar(Car car) {
		this.car = car;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public Merchant getMerchant() {
		return merchant;
	}

	public void setMerchant(Merchant merchant) {
		this.merchant = merchant;
	}

	public BigDecimal getSalePrice() {
		return salePrice;
	}

	public void setSalePrice(BigDecimal salePrice) {
		this.salePrice = salePrice;
	}

	public Date getDateOfSale() {
		return dateOfSale;
	}

	public void setDateOfSale(Date dateOfSale) {
		this.dateOfSale = dateOfSale;
	}

}
