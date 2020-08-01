package com.AllForPets.PetsForAll.Capstone3.Services;

import com.AllForPets.PetsForAll.Capstone3.Dto.ProductDto;

import java.util.List;

public interface ProductService {
    ProductDto createProduct(ProductDto productDto);

    List<ProductDto> getProducts(Integer pageNo, Integer pageSize, String sortBy);
}
