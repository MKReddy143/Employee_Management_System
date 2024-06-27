package com.java.SHProject.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;

@Entity
@Table(name = "Employee")
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private int age;
	private String department;
	private String address;
	@Column(nullable = true, length = 64)
	private String photo;

	@Transient
	public String getphotos() {
		if (photo == null)
			return null;
		return "/Employee-photo/" + "/" + photo;
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

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhoto() {
		return photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}

	public Employee(int id, String name, int age, String department, String address, String photo) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.department = department;
		this.address = address;
		this.photo = photo;
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

}