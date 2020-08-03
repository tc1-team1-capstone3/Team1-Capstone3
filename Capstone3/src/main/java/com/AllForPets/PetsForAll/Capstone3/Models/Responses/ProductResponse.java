package com.AllForPets.PetsForAll.Capstone3.Models.Responses;

public class ProductResponse {

    Long id;

    public ProductResponse(Long id) {
        this.id = id;
    }

    public ProductResponse() {
    }

    public void setId(Long id) {
        this.id = id;
    }
    
    public Long getId() {
        return id;
    }
}
