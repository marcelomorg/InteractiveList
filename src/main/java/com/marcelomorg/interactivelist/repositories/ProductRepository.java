package com.marcelomorg.interactivelist.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.marcelomorg.interactivelist.entities.Product;
import com.marcelomorg.interactivelist.projections.ParametersProjection;

public interface ProductRepository extends JpaRepository<Product, Long>{
    
    @Query(nativeQuery = true, value = """
        SELECT tb_products.id, tb_products.title, tb_products.genre, tb_products.product_year AS yearProduct, 
            tb_products.img_url As imgUrl, tb_products.short_description AS shortDescription, 
            tb_products_list.name_list AS name, tb_belong.position
        FROM tb_products
        INNER JOIN tb_belong
        ON tb_products.id = tb_belong.product_id
        INNER JOIN tb_products_list
        ON tb_products_list.id = tb_belong.productlist_id
        WHERE tb_products_list.id = :idList
        ORDER BY tb_belong.position ASC
            """)
    List<ParametersProjection> findByList(Long idList);
}
