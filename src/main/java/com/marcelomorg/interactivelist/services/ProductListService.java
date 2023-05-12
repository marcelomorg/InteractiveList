package com.marcelomorg.interactivelist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.marcelomorg.interactivelist.dtos.ProductListDTO;
import com.marcelomorg.interactivelist.entities.ProductList;
import com.marcelomorg.interactivelist.repositories.ProductListRepositoty;

@Service
public class ProductListService {
    
    @Autowired
    private ProductListRepositoty productListRepositoty;

    @Transactional(readOnly = true)
    public List<ProductListDTO> findAll(){

        List<ProductList> result = productListRepositoty.findAll();
        List<ProductListDTO> dtoResult = result.stream().map(item -> new ProductListDTO(item)).toList();
        return dtoResult;
    }
    
    public ProductListDTO findById(Long id){  

        try{

            ProductList result = productListRepositoty.findById(id).get();
            ProductListDTO dtoResult = new ProductListDTO(result);
            return dtoResult;

        } catch(Exception e){

            ProductListDTO erro = new ProductListDTO();
            erro.setId(id);
            erro.setName("Not Found");
            return erro;
        }
    }

}