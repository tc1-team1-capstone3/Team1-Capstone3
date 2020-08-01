package com.AllForPets.PetsForAll.Capstone3.dao;


import com.AllForPets.PetsForAll.Capstone3.Models.ProductModel;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends PagingAndSortingRepository<ProductModel, Long> {
}
