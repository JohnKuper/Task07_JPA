package com.johnkuper.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "merchants")
public class Merchant {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id_merchant")
	private int id;

	@Column(length = 100)
	private String name;

	@Column(length = 100)
	private String surname;

	@Column(length = 100)
	private String patronic;

	public Merchant() {
	}

	public Merchant(String name, String surname, String patronic) {
		this.name = name;
		this.surname = surname;
		this.patronic = patronic;
	}

	@Override
	public String toString() {
		return " Merchant: {id = " + id + "; name = " + name + "; surname = "
				+ surname + "; patronic = " + patronic + "} ";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getPatronic() {
		return patronic;
	}

	public void setPatronic(String patronic) {
		this.patronic = patronic;
	}

}
