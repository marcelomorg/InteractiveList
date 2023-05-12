package com.marcelomorg.interactivelist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.marcelomorg.interactivelist.entities.ProductList;

public interface ProductListRepositoty extends JpaRepository<ProductList, Long>{
    
}
