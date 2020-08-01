package com.AllForPets.PetsForAll.Capstone3.Models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ProductModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    public ProductModel() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {this.id = id;}

}
