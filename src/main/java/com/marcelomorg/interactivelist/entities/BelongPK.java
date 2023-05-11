package com.marcelomorg.interactivelist.entities;

import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Embeddable
public class BelongPK {
    
    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;

    @ManyToOne
    @JoinColumn(name = "productlist_id")
    private ProductList productList;

    public BelongPK(){
    }

    public BelongPK(Product product, ProductList productList){
        this.product = product;
        this.productList = productList;
    }

    public Product getProductID() {
        return product;
    }

    public void setProductID(Product productID) {
        this.product = productID;
    }

    public ProductList getProductListID() {
        return productList;
    }

    public void setProductListID(ProductList productListID) {
        this.productList = productListID;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((product == null) ? 0 : product.hashCode());
        result = prime * result + ((productList == null) ? 0 : productList.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        BelongPK other = (BelongPK) obj;
        if (product == null) {
            if (other.product != null)
                return false;
        } else if (!product.equals(other.product))
            return false;
        if (productList == null) {
            if (other.productList != null)
                return false;
        } else if (!productList.equals(other.productList))
            return false;
        return true;
    }    
}