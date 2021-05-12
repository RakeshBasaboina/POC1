package com.example.demo.Moodel;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="studentDetails")
public class StudentModel {

	@Id
	@Column
	private int id;
	@Column
	private String name;
	@Column
	private int classN;
	@Column
	private String address;
	@Column
	private String emailId;
	@Column
	private int phoneno;
	public int getid() {
		return id;
	}
	public void setid(int id) {
		this.id=id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getClassN() {
		return classN;
	}
	public void setClassN(int classN) {
		this.classN = classN;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public int getPhoneno() {
		return phoneno;
	}
	public void setPhoneno(int phoneno) {
		this.phoneno = phoneno;
	}
	@Override
	public String toString() {
		return "StudentModel [name=" + name + ", classN=" + classN + ", address=" + address + ", emailId=" + emailId
				+ ", phoneno=" + phoneno + "]";
	}
	
	
	
}
