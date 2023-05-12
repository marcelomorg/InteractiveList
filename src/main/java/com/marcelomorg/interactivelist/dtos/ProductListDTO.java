package com.marcelomorg.interactivelist.dtos;

import com.marcelomorg.interactivelist.entities.ProductList;

public class ProductListDTO {
   
    private Long id;    
    private String name;

    public ProductListDTO(){

    }

    public ProductListDTO(ProductList entity){
        this.id = entity.getId();
        this.name = entity.getName();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    
    
}
