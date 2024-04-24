package com.example.demo.model;

import org.springframework.stereotype.Component;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
@Entity
@Component
public class Student {
@Id
private int Id;
private String Name;
private String Address;
private int Marks;
public int getId() {
	return Id;
}
public void setId(int id) {
	Id = id;
}
public String getName() {
	return Name;
}
public void setName(String name) {
	Name = name;
}
public String getAddress() {
	return Address;
}
public void setAddress(String address) {
	Address = address;
}
public int getMarks() {
	return Marks;
}
public void setMarks(int marks) {
	Marks = marks;
}
@Override
public String toString() {
	return "Student [Id=" + Id + ", Name=" + Name + ", Address=" + Address + ", Marks=" + Marks + "]";
}
public Student(int id, String name, String address, int marks) {
	super();
	Id = id;
	Name = name;
	Address = address;
	Marks = marks;
}
public Student() {
	super();
}

}
