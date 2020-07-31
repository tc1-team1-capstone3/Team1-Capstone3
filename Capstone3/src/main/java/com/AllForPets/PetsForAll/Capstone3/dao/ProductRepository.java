package com.AllForPets.PetsForAll.Capstone3.dao;

import com.AllForPets.PetsForAll.Capstone3.Models.ProductModel;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends MongoRepository<ProductModel, String> {
    public ProductModel findByProductName(String productName);
    public ProductModel findBySKU(Long productSKU);
}
