package com.esisba.orderservice.Entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name= "t_orders_line_items")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class orderLineItems {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String skucode;

    private int quantity;
    private double totalPrice;

}
