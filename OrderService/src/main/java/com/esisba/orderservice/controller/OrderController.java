package com.esisba.orderservice.controller;

import com.esisba.orderservice.dto.OrderRequest;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/order")
public class OrderController {
    @PostMapping
    public String createOrder(@RequestBody OrderRequest orderRequest){
    return "order placed success";
    };
}
