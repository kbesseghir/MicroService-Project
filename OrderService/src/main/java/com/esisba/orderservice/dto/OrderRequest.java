package com.esisba.orderservice.dto;

import com.esisba.orderservice.Entity.orderLineItems;
import jakarta.persistence.CascadeType;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class OrderRequest {
    private String orderNumber;
    @OneToMany(cascade = CascadeType.ALL)
    private List<orderLineItemsDto> orderLineItemsListDto;

}
