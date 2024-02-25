//package com.esisba.productservice;
//
//import com.esisba.productservice.model.Product;
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.http.MediaType;
//import org.springframework.test.context.DynamicPropertyRegistry;
//import org.springframework.test.context.DynamicPropertySource;
//import org.springframework.test.web.servlet.MockMvc;
//import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
//import org.testcontainers.containers.MongoDBContainer;
//import org.testcontainers.junit.jupiter.Container;
//import org.testcontainers.junit.jupiter.Testcontainers;
//
//@SpringBootTest
//@Testcontainers
//@AutoConfigureMockMvc
//class ProductServiceApplicationTests {
//    @Container
//    static MongoDBContainer mongoDBContainer = new MongoDBContainer("mongo:4.0.10");
//    @Autowired
//    private MockMvc mockMvc;
//    @DynamicPropertySource
//    static void setProperties(DynamicPropertyRegistry dynamicPropertyRegistry){
//        dynamicPropertyRegistry.add("spring.data.mongodb.url",mongoDBContainer::getReplicaSetUrl);
//    }
//    @Test
//    void contextLoads() {
//        Product product = Product.builder()
//                .name("Test Product")
//                .price(10.0)
//                .build();
//
//        Product savedProduct = Product.builder()
//                .id(1L)
//                .name("Test Product")
//                .price(10.0)
//                .build();
//
//        when(productService.createProduct(product)).thenReturn(savedProduct);
//
//        // Act
//        mockMvc.perform(MockMvcRequestBuilders.post("/api/product")
//                        .contentType(MediaType.APPLICATION_JSON)
//                        .content(asJsonString(product)))
//                .andExpect(status().isCreated())
//                .andExpect(jsonPath("$.id").value(savedProduct.getId().intValue()))
//                .andExpect(jsonPath("$.name").value(savedProduct.getName()))
//                .andExpect(jsonPath("$.price").value(savedProduct.getPrice()))
//                .andReturn();
//    }
//
//}
