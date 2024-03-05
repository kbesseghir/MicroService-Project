package com.esisba.orderservice.controller;

import com.esisba.orderservice.dto.OrderRequest;
import com.esisba.orderservice.service.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping(value = "/api/order")
public class OrderController {

    private final OrderService orderService;
    @PostMapping
    public String createOrder(@RequestBody OrderRequest orderRequest){

        orderService.placeOrder(orderRequest);
        return "success";
    }
}
