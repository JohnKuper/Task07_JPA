package com.johnkuper.domain;

import com.johnkuper.daointerface.DomainObject;

public class MerchantDomain implements DomainObject {

	private int id; // id
	private String merchName; // name
	private String merchSurname; // surname
	private String merchPatronymic; // patronymic

	public MerchantDomain() {
	}

	public MerchantDomain(String merchName, String merchSurname,
			String merchPatronymic) {
		this.merchName = merchName;
		this.merchSurname = merchSurname;
		this.merchPatronymic = merchPatronymic;
	}

	@Override
	public String toString() {
		return "MerchantDomain: {id = " + id + "; merchName = " + merchName
				+ "; merchSurname = " + merchSurname + "; merchPatronymic = "
				+ merchPatronymic + "}";
	}

	@Override
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMerchName() {
		return merchName;
	}

	public void setMerchName(String merchName) {
		this.merchName = merchName;
	}

	public String getMerchSurname() {
		return merchSurname;
	}

	public void setMerchSurname(String merchSurname) {
		this.merchSurname = merchSurname;
	}

	public String getMerchPatronymic() {
		return merchPatronymic;
	}

	public void setMerchPatronymic(String merchPatronymic) {
		this.merchPatronymic = merchPatronymic;
	}

}
