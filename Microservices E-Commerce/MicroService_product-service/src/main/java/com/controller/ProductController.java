package com.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import lombok.RequiredArgsConstructor;


import com.model.Product;
import com.repository.ProductRepository;
import com.service.ProductService;

import java.util.List;

@RestController
@RequestMapping("/api/product")
@RequiredArgsConstructor
public class ProductController {
	
	@Autowired
    private ProductService productService;
	
	@Autowired
	private ProductRepository productRepo;
    
	    @PostMapping
	    public Product createProduct(@RequestBody Product pro) {
	        return productRepo.save(pro);
	    }
	    
	    @GetMapping("/{id}") 
		  public Optional<Product> getStudent(@PathVariable int id) {
		  return productRepo.findById(id); }
	    
		@GetMapping("/") // for getting all products
		public List<Product> getall()
		{
			return productRepo.findAll();
		}
		

		
		  @DeleteMapping("/{id}") 
		  public void deleteProduct(@PathVariable int id) {
		  productRepo.deleteById(id); }
		 
		 
	   

	    @PutMapping("/{id}")
	    public Product updateProduct(@PathVariable int id, @RequestBody Product updatedProduct) {
	        updatedProduct.setId(id); // Set the ID to update the existing student
	        return productRepo.save(updatedProduct);
	    }

	}
