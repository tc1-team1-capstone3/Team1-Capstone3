package com.AllForPets.PetsForAll.Capstone3.Controllers;

import com.AllForPets.PetsForAll.Capstone3.Dto.ProductDto;
import com.AllForPets.PetsForAll.Capstone3.Models.Requests.ProductRequest;
import com.AllForPets.PetsForAll.Capstone3.Models.Responses.ProductResponse;
import com.AllForPets.PetsForAll.Capstone3.Services.ProductService;
import org.springframework.beans.BeanUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("products")
public class ProductController {

    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @PostMapping
    public ProductResponse createProduct(@RequestBody ProductRequest productRequest) {
        ProductDto productDto = new ProductDto();
        BeanUtils.copyProperties(productRequest, productDto);

        ProductDto updatedProduct = productService.createProduct(productDto);

        ProductResponse returnValue = new ProductResponse();
        BeanUtils.copyProperties(updatedProduct, returnValue);
        return returnValue;
    }
}
