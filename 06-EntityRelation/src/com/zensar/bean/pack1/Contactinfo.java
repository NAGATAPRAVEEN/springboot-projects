package com.zensar.bean.pack1;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="ContactInfo10")

public class Contactinfo {
	
	@Id
	@Column
	
	
	int contactId;
	@Column
	String email;
	@Column 
	String phone;
	@OneToOne()
	@MapsId
	@JoinColumn(name="person_Id")
	Person person;
	public Contactinfo(String email, String phone) {
		super();
		this.email = email;
		this.phone = phone;
	}
	public Contactinfo() {
		super();
	}
	public int getContactId() {
		return contactId;
	}
	public void setContactId(int contactId) {
		this.contactId = contactId;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public Person getPerson() {
		return person;
	}
	public void setPerson(Person person) {
		this.person = person;
	}
	@Override
	public String toString() {
		return "Contactinfo [contactId=" + contactId + ", email=" + email + ", phone=" + phone + "]";
	}
	
	

}
