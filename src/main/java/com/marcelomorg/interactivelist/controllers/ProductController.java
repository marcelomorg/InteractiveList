package com.marcelomorg.interactivelist.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.marcelomorg.interactivelist.dtos.ProductDTO;
import com.marcelomorg.interactivelist.dtos.ProductMinDTO;
import com.marcelomorg.interactivelist.services.ProductService;

@RestController
@RequestMapping(value = "/products")
public class ProductController {
    
    @Autowired
    private ProductService productService;

    @GetMapping
    public List<ProductDTO> findAll(){
        return productService.findAll();
    }

    @GetMapping("/min")
    public List<ProductMinDTO> findMinAll(){
        return productService.findMinAll();
    }

    @GetMapping("/{id}")
    public ProductDTO findById(@PathVariable Long id){
        return productService.findById(id);
    }

}
