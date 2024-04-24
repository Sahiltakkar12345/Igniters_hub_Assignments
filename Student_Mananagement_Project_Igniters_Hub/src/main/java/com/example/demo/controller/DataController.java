package com.example.demo.controller;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.demo.service.*;
import com.example.demo.dao.StudentRepo;
import com.example.demo.model.Student;

@RestController
@RequestMapping("/students")
public class DataController {

    private StudentRepo studentRepository;

    @Autowired
    public DataController(StudentRepo studentRepository) {
        this.studentRepository = studentRepository;
    }
    
    @PostMapping
    public Student createStudent(@RequestBody Student student) {
        return studentRepository.save(student);
    }
    
    @GetMapping("/{id}") 
	  public Optional<Student> getStudent(@PathVariable int id) {
	  return studentRepository.findById(id); }
    
	@GetMapping("/") // for getting all students
	public List<Student> getall()
	{
		return studentRepository.findAll();
	}
	

	
	  @DeleteMapping("/{id}") 
	  public void deleteStudent(@PathVariable int id) {
	  studentRepository.deleteById(id); }
	 
	 
   

    @PutMapping("/{id}")
    public Student updateStudent(@PathVariable int id, @RequestBody Student updatedStudent) {
        updatedStudent.setId(id); // Set the ID to update the existing student
        return studentRepository.save(updatedStudent);
    }

}
