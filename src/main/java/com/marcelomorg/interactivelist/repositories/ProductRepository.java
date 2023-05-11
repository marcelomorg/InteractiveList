package com.marcelomorg.interactivelist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.marcelomorg.interactivelist.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{
    
}
