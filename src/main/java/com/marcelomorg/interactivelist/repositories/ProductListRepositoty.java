package com.marcelomorg.interactivelist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.marcelomorg.interactivelist.entities.ProductList;

public interface ProductListRepositoty extends JpaRepository<ProductList, Long>{

    @Modifying
    @Query(nativeQuery = true, 
        value = "UPDATE tb_belong SET position = :position WHERE productlist_id = :prodListId AND product_id = :prodId")
    void updateBelongListPosition(Integer position, Long prodListId, Long prodId);
}
