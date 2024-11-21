package com.devops.order_service_api_3.dto.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ResponseCustomerOrderDto {
    private String id;
    private List<Object> items;
    private double cost;
    private String customerEmail;
}
