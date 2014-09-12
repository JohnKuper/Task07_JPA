package com.johnkuper.domain;

public class MerchantDomain {

	private int id; // id
	private String merchName; // name
	private String mercNurname; // surname
	private String merchNatronic; // patronic

	public MerchantDomain() {
	}

	public MerchantDomain(int id, String merchName, String mercNurname,
			String merchNatronic) {
		this.id = id;
		this.merchName = merchName;
		this.mercNurname = mercNurname;
		this.merchNatronic = merchNatronic;
	}

	public int getId() {
		return id;
	}


	public String getMerchName() {
		return merchName;
	}

	public void setMerchName(String merchName) {
		this.merchName = merchName;
	}

	public String getMercNurname() {
		return mercNurname;
	}

	public void setMercNurname(String mercNurname) {
		this.mercNurname = mercNurname;
	}

	public String getMerchNatronic() {
		return merchNatronic;
	}

	public void setMerchNatronic(String merchNatronic) {
		this.merchNatronic = merchNatronic;
	}

}
