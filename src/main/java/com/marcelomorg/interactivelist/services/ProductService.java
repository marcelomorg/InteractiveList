package com.marcelomorg.interactivelist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.marcelomorg.interactivelist.dtos.ProductMinDTO;
import com.marcelomorg.interactivelist.entities.Product;
import com.marcelomorg.interactivelist.repositories.ProductRepository;

@Service
public class ProductService {
    
    @Autowired
    private ProductRepository productRepository;

    public List<ProductMinDTO> findAll(){
        List<Product> result = productRepository.findAll();
        List<ProductMinDTO> dtoResult = result.stream().map(x -> new ProductMinDTO(x)).toList();
        return dtoResult;        
    }
}
