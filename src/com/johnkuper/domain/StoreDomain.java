package com.johnkuper.domain;

import java.math.BigDecimal;

import com.johnkuper.entity.Car;

public class StoreDomain {

	private int id; // id
	private Car car;
	private int amount; // count
	private BigDecimal carPrice; // price
	private boolean testDrive; // testdrive_avaible

	public StoreDomain() {
	}

	public StoreDomain(int id, Car car, int amount, BigDecimal carPrice,
			boolean testDrive) {
		this.id = id;
		this.car = car;
		this.amount = amount;
		this.carPrice = carPrice;
		this.testDrive = testDrive;
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

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public BigDecimal getCarPrice() {
		return carPrice;
	}

	public void setCarPrice(BigDecimal carPrice) {
		this.carPrice = carPrice;
	}

	public boolean isTestDrive() {
		return testDrive;
	}

	public void setTestDrive(boolean testDrive) {
		this.testDrive = testDrive;
	}

}
