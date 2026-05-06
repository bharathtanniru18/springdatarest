package com.annex.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.annex.Model.Products;
import com.annex.dao.ProductDao;

@RestController
public class ProductController {
    
	@Autowired
	private ProductDao pdao;
	
	@GetMapping("/products")
	
	public List<Products> getProducts(){
		
		System.out.println("welcome to products page");
		return pdao.findAll();
	}
	
	@DeleteMapping("/deleteproduct/{pid}")
	public String deleteProduct(@PathVariable("pid") int pid) {
		Products p = pdao.getOne(pid);
		pdao.delete(p);
		return "Your record has been deleted";
		
	}
	
	@PutMapping("/updateproduct")
	public Products updateProduct(@RequestBody Products product) {
		return pdao.save(product);
	}
	@GetMapping("/products/{pid}")
	
	public Optional<Products> getProduct(@PathVariable("pid") int pid){
		
		
		return pdao.findById(pid);
	}
	
	@PostMapping("/saveproduct")
	
	public Products saveProduct(Products product){
		
		
		return pdao.save(product);
	}
	
	
}
