package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Student;

import com.example.demo.dao.*;

@Service
public class StudentServiceImple implements StudentService
{
	@Autowired
	StudentRepo studentRepo;

	@Override
	public Student save(Student s) {
		// TODO Auto-generated method stub
		return studentRepo.save(s);
	}

	@Override
	public Student get(int id) {
		// TODO Auto-generated method stub
	Optional<Student> obj=studentRepo.findById(id);	
		return obj.get();
	}

	@Override
	public List<Student> getAll() {
		// TODO Auto-generated method stub
		return studentRepo.findAll();
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		studentRepo.deleteById(id);
	}

	@Override
	public Student update(Student s) {
		// TODO Auto-generated method stub
		return studentRepo.save(s);
	}


}
