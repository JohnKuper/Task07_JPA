package com.johnkuper.domain;

import java.util.Date;

import com.johnkuper.daointerface.DomainObject;

public class CustomerDomain implements DomainObject {

	private int id; // id
	private String custName; // name
	private String custSurname; // surname
	private String custPatronymic; // patronymic
	private String passportSeries; // passport_series
	private String passportNumber; // passport_number
	private Date dateOfBirth; // birthdate

	public CustomerDomain() {
	}

	public CustomerDomain(String custName, String custSurname,
			String custPatronymic, String passportSeries,
			String passportNumber, Date dateOfBirth) {
		this.custName = custName;
		this.custSurname = custSurname;
		this.custPatronymic = custPatronymic;
		this.passportSeries = passportSeries;
		this.passportNumber = passportNumber;
		this.dateOfBirth = dateOfBirth;
	}

	@Override
	public String toString() {
		return "CustomerDomain: {id = " + id + "; custName = " + custName
				+ "; custSurname = " + custSurname + "; custPatronymic = "
				+ custPatronymic + "; passportSeries = " + passportSeries
				+ "; passportNumber = " + passportNumber + "; dateOfBirth = "
				+ dateOfBirth + "}";
	}

	@Override
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
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

	public String getCustPatronymic() {
		return custPatronymic;
	}

	public void setCustPatronymic(String custPatronymic) {
		this.custPatronymic = custPatronymic;
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
