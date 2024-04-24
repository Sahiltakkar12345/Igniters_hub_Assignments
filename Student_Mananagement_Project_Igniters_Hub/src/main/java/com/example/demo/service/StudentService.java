package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Student;

public interface StudentService {
	public Student save(Student s);
	public Student get(int id);
	public List<Student> getAll();
	public void delete(int id);
	public Student update(Student s);


}
