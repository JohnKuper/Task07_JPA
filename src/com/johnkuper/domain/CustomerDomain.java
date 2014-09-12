package com.johnkuper.domain;

import java.util.Date;

public class CustomerDomain {

	public int id; // id
	public String custName; // name
	public String custSurname; // surname
	public String custPatronymic; // patronymic
	public String passportSeries; // passport_series
	public String passportNumber; // passport_number
	public Date dateOfBirth; // birthdate

	public CustomerDomain() {
	}

	public CustomerDomain(int id, String custName, String custSurname,
			String custPatronymic, String passportSeries, String passportNumber,
			Date dateOfBirth) {
		this.id = id;
		this.custName = custName;
		this.custSurname = custSurname;
		this.custPatronymic = custPatronymic;
		this.passportSeries = passportSeries;
		this.passportNumber = passportNumber;
		this.dateOfBirth = dateOfBirth;
	}
	
	@Override
	public String toString() {
		return "CustomerDomain: {id = " + id +
				"; custName = " + custName +
				"; custSurname = " + custSurname +
				"; custPatronymic = " + custPatronymic +
				"; passportSeries = " + passportSeries +
				"; passportNumber = " + passportNumber +
				"; dateOfBirth = " + dateOfBirth + "}";
	}

}
