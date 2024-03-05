package com.esisba.orderservice.service;

import com.esisba.orderservice.Entity.Order;
import com.esisba.orderservice.Entity.orderLineItems;
import com.esisba.orderservice.dto.OrderRequest;
import com.esisba.orderservice.dto.orderLineItemsDto;
import com.esisba.orderservice.repository.OrderRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;

@Service
@RequiredArgsConstructor
public class OrderService {
    private final OrderRepository orderRepository;

    public static void placeOrder(OrderRequest orderRequest) {
        Order order = new Order();
        order.setOrderNumber(UUID.randomUUID().toString());

        List<orderLineItems> orderLineItemsList = orderRequest.getOrderLineItemsListDto().stream()
                .map(this::mapToItemsDto)
                .toList();

        order.setOrderLineItemsList(orderLineItemsList);
        orderRepository.save(order);
    }

    private orderLineItems mapToItemsDto(orderLineItemsDto orderLineItemsDto) {
        orderLineItems orderlineitems= new orderLineItems();
        orderlineitems.setSkucode(orderLineItemsDto.getSkucode());
        orderlineitems.setQuantity(orderLineItemsDto.getQuantity());
        orderlineitems.setTotalPrice(orderLineItemsDto.getTotalPrice());
        return orderlineitems;
    }
}
