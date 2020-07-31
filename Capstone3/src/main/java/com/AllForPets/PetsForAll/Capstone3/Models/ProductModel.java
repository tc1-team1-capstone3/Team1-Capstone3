package com.AllForPets.PetsForAll.Capstone3.Models;

import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Document
public class ProductModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long productID;
    String productName;
    String productDescription;
    int productQuantity;
    Double productPrice;
    Long productSKU;

    public ProductModel(String productName, String description, int quantity, Double price, Long SKU) {
        this.productName = productName;
        this.productDescription = description;
        this.productQuantity = quantity;
        this.productPrice = price;
        this.productSKU = SKU;
    }

    public Long getProductID() {
        return productID;
    }

    public String getProductName() {
        return productName;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public int getProductQuantity() {
        return productQuantity;
    }

    public Double getProductPrice() {
        return productPrice;
    }

    public Long getProductSKU() {
        return productSKU;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setProductDescription(String description) {
        this.productDescription = description;
    }

    public void setProductQuantity(int quantity) {
        this.productQuantity = quantity;
    }

    public void setProductPrice(Double price) {
        this.productPrice = price;
    }

    public void setProductSKU(Long SKU) {
        this.productSKU = SKU;
    }
}
