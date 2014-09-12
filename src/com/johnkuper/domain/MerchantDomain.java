package com.johnkuper.domain;

public class MerchantDomain {

	public int id; // id
	public String merchName; // name
	public String merchSurname; // surname
	public String merchPatronymic; // patronymic

	public MerchantDomain() {
	}

	public MerchantDomain(int id, String merchName, String merchSurname,
			String merchPatronymic) {
		this.id = id;
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

}
