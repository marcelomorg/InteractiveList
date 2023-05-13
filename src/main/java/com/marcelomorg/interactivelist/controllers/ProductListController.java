package com.marcelomorg.interactivelist.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.marcelomorg.interactivelist.dtos.ProductListContentDTO;
import com.marcelomorg.interactivelist.dtos.ProductListDTO;
import com.marcelomorg.interactivelist.services.ProductListService;
import com.marcelomorg.interactivelist.services.ProductService;

@RestController
@RequestMapping(value = "/list")
public class ProductListController {

    @Autowired
    private ProductListService productListService;

    @Autowired
    private ProductService productService;
    
    @GetMapping
    public List<ProductListDTO> findAll(){
        List<ProductListDTO> result = productListService.findAll();
        return result;
    }

    @GetMapping(value = "/{id}")
    public ProductListDTO findById(@PathVariable Long id){
        return productListService.findById(id);
    }

    @GetMapping(value = "/{id}/products")
    public List<ProductListContentDTO> findByProductsInList(@PathVariable Long id){
        return productService.findByProductsInList(id);
    }
}
