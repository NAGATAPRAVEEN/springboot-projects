package com.zensar.bean.pack1;

import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;

import javax.persistence.Table;
@Entity
@Table(name="person10")

public class Person {
	@Id
	@Column
	
	 int personId;
	@Column
	 String personName;
	@Column
	 LocalDate dateOfBirth;
	@Column
	 char gender;
	@OneToOne(mappedBy = "person",cascade = CascadeType.ALL)
	@PrimaryKeyJoinColumn
	 Contactinfo contactInfo;
	public Person(String personName, LocalDate dateOfBirth, char gender) {
		super();
		this.personName = personName;
		this.dateOfBirth = dateOfBirth;
		this.gender = gender;
	}
	public Person() {
		super();
	}
	public int getPersonId() {
		return personId;
	}
	public void setPersonId(int personId) {
		this.personId = personId;
	}
	public String getPersonName() {
		return personName;
	}
	public void setPersonName(String personName) {
		this.personName = personName;
	}
	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public Contactinfo getContactInfo() {
		return contactInfo;
	}
	public void setContactInfo(Contactinfo contactInfo) {
		this.contactInfo = contactInfo;
	}
	@Override
	public String toString() {
		return "Person [personId=" + personId + ", personName=" + personName + ", dateOfBirth=" + dateOfBirth
				+ ", gender=" + gender + ", contactInfo=" + contactInfo + "]";
	}
	
	
	}
	
	


