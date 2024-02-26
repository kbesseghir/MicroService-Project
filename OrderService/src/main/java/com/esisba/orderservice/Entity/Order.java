package com.esisba.orderservice.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name="t_orders")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String orderNumber;
    @OneToMany(cascade = CascadeType.ALL)
    private List<orderLineItems> orderLineItemsList;

//    private String customerName;
//    private String productName;
//    private int quantity;
//    private double totalPrice;
}
