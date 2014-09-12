package com.johnkuper.domain;

import java.math.BigDecimal;

import com.johnkuper.entity.Car;

public class StoreDomain {

	public int id;
	public Car car;
	public int amount; // count
	public BigDecimal carPrice; // price
	public boolean testDrive; // testdrive_avaible

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
	
	@Override
	public String toString() {
		return "StoreDomain: {id = " + id +
				"; amount = " + amount +
				"; carPrice = " + carPrice +
				"; testDrive = " + testDrive +
				"%n" + car + "}%n";
	}


}
