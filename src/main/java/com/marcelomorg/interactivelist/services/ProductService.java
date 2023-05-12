package com.marcelomorg.interactivelist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.marcelomorg.interactivelist.dtos.ProductDTO;
import com.marcelomorg.interactivelist.dtos.ProductMinDTO;
import com.marcelomorg.interactivelist.entities.Product;
import com.marcelomorg.interactivelist.repositories.ProductRepository;

@Service
public class ProductService {
    
    @Autowired
    private ProductRepository productRepository;
    
    @Transactional(readOnly = true)
    public List<ProductMinDTO> findMinAll(){
        List<Product> result = productRepository.findAll();
        List<ProductMinDTO> dtoMinResult = result.stream().map(x -> new ProductMinDTO(x)).toList();
        return dtoMinResult;        
    }

    @Transactional(readOnly = true)
    public List<ProductDTO> findAll(){
        List<Product> result = productRepository.findAll();
        List<ProductDTO> dtoResult = result.stream().map(item -> new ProductDTO(item)).toList();
        return dtoResult;
    }

    @Transactional(readOnly = true)
    public ProductDTO findById(Long id){        
        
        try{
            ProductDTO idResult = new ProductDTO(productRepository.findById(id).get());
            return idResult;
        } catch (Exception e){
            ProductDTO erro = new ProductDTO();
            erro.setId(id);
            erro.setGenre("Not found");
            erro.setImgUrl("Not found");
            erro.setLongDescription("Not found");
            erro.setPlatform("Not Found");
            erro.setShortDescription("Not Found");
            erro.setTitle("Not found");
            System.out.println("Erro at the search in line 39 of ProductService.findybyId method. ERRO: " + e.getMessage());
            return erro;
        }

    }

}
