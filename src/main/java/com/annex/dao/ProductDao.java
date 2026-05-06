package com.annex.dao;

import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.support.JpaRepositoryConfigurationAware;
//import org.springframework.data.repository.CrudRepository;

import com.annex.Model.Products;

public interface ProductDao extends JpaRepository<Products, Integer>{
      
}
