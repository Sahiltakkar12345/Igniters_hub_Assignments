package com.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Employee {
    @Id
 //   @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private int age;
    private String gender;
    private boolean hasCar;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
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
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public boolean isHasCar() {
		return hasCar;
	}
	public void setHasCar(boolean hasCar) {
		this.hasCar = hasCar;
	}
	public Employee(Long id, String name, int age, String gender, boolean hasCar) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.hasCar = hasCar;
	}
	public Employee() {
		super();
	}

    
}

