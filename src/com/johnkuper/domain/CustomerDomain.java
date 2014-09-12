package com.johnkuper.domain;

import java.util.Date;

public class CustomerDomain {

	private int id; // id
	private String custName; // name
	private String custSurname; // surname
	private String custPatronic; // patronic
	private String passportSeries; // passport_series
	private String passportNumber; // passport_number
	private Date dateOfBirth; // birthdate

	public CustomerDomain() {
	}

	public CustomerDomain(int id, String custName, String custSurname,
			String custPatronic, String passportSeries, String passportNumber,
			Date dateOfBirth) {
		this.id = id;
		this.custName = custName;
		this.custSurname = custSurname;
		this.custPatronic = custPatronic;
		this.passportSeries = passportSeries;
		this.passportNumber = passportNumber;
		this.dateOfBirth = dateOfBirth;
	}

	public int getId() {
		return id;
	}


	public String getCustName() {
		return custName;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}

	public String getCustSurname() {
		return custSurname;
	}

	public void setCustSurname(String custSurname) {
		this.custSurname = custSurname;
	}

	public String getCustPatronic() {
		return custPatronic;
	}

	public void setCustPatronic(String custPatronic) {
		this.custPatronic = custPatronic;
	}

	public String getPassportSeries() {
		return passportSeries;
	}

	public void setPassportSeries(String passportSeries) {
		this.passportSeries = passportSeries;
	}

	public String getPassportNumber() {
		return passportNumber;
	}

	public void setPassportNumber(String passportNumber) {
		this.passportNumber = passportNumber;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

}
