package com.annex.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.annex.Model.Products;
import com.annex.dao.ProductDao;

@Controller
public class ProductController {
    
	@Autowired
	private ProductDao pdao;
	
	@GetMapping("/products")
	@ResponseBody
	public List<Products> getProducts(){
		
		System.out.println("welcome to products page");
		return pdao.findAll();
	}
	
	@GetMapping("/products/{pid}")
	@ResponseBody
	public Optional<Products> getProduct(@PathVariable("pid") int pid){
		
		
		return pdao.findById(pid);
	}
	
	@PostMapping("/saveproduct")
	@ResponseBody
	public Products saveProduct(Products product){
		
		
		return pdao.save(product);
	}
	
	
}
