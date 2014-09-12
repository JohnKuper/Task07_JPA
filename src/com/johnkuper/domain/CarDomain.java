package com.johnkuper.domain;

public class CarDomain {

	public int id; // id
	public String car_mark; // name
	public String car_model; // model
	public String motorpower; // modification
	public String car_color; // color

	public CarDomain() {
	}

	public CarDomain(int id, String car_mark, String car_model,
			String motorpower, String car_color) {
		this.id = id;
		this.car_mark = car_mark;
		this.car_model = car_model;
		this.motorpower = motorpower;
		this.car_color = car_color;
	}

	@Override
	public String toString() {
		return "CarDomain: {id = " + id + "; car_mark = " + car_mark
				+ "; car_model = " + car_model + "; motorpower = " + motorpower
				+ "; car_color = " + car_color + "}";
	}

}
