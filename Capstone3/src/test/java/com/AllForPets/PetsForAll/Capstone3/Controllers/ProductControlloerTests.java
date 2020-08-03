package com.AllForPets.PetsForAll.Capstone3.Controllers;

import static org.hamcrest.Matchers.containsString;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

@SpringBootTest
@AutoConfigureMockMvc

public class ProductControlloerTests {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void testCreateProduct() throws Exception {
        this.mockMvc.perform(post("/products")).andDo(print()).andExpect(status().isOk())
                .andExpect(content().string(containsString("{\"id\":1}")));
    }

    @Test
    public void testGetProducts() throws Exception {
        this.mockMvc.perform(post("/products"));
        this.mockMvc.perform(get("/products")).andDo(print()).andExpect(status().isOk())
                .andExpect(content().string(containsString("{\"id\":1}")));
    }
}
