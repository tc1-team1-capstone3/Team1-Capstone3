package com.AllForPets.PetsForAll.Capstone3.Controllers;

import com.AllForPets.PetsForAll.Capstone3.Dto.ProductDto;
import com.AllForPets.PetsForAll.Capstone3.Models.Requests.ProductRequest;
import com.AllForPets.PetsForAll.Capstone3.Models.Responses.ProductResponse;
import com.AllForPets.PetsForAll.Capstone3.Services.ProductService;
import com.AllForPets.PetsForAll.Capstone3.dao.ProductRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

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

    @GetMapping
    public List<ProductResponse> getProducts(@RequestParam(defaultValue = "0") Integer pageNo,
                                             @RequestParam(defaultValue = "5") Integer pageSize,
                                             @RequestParam(defaultValue = "id") String sortBy) {
        List<ProductResponse> returnValue = new ArrayList<>();
        List<ProductDto> productDtos = productService.getProducts(pageNo, pageSize, sortBy);
        for (ProductDto productDto : productDtos) {
            ProductResponse temp = new ProductResponse();
            BeanUtils.copyProperties(productDto, temp);
            returnValue.add(temp);
        }
        return returnValue;
    }
}
