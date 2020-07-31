package com.AllForPets.PetsForAll.Capstone3.Services.Implementations;

import com.AllForPets.PetsForAll.Capstone3.Dto.ProductDto;
import com.AllForPets.PetsForAll.Capstone3.Models.ProductModel;
import com.AllForPets.PetsForAll.Capstone3.Services.ProductService;
import com.AllForPets.PetsForAll.Capstone3.dao.ProductRepository;
import org.springframework.beans.BeanUtils;

public class ProductServiceImplementation implements ProductService {

    private final ProductRepository productRepository;

    public ProductServiceImplementation(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public ProductDto createProduct(ProductDto productDto) {

        ProductModel newProduct = new ProductModel();
        BeanUtils.copyProperties(productDto, newProduct);

        newProduct.setSku(1000 + newProduct.getId());
        ProductModel storedProductDetails = (ProductModel) productRepository.save(newProduct);

        ProductDto returnValue = new ProductDto();
        BeanUtils.copyProperties(storedProductDetails, returnValue);
        return returnValue;
    }
}
