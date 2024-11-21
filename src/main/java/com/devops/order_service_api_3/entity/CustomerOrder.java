package com.devops.order_service_api_3.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Document( collation = "orders" )
public class CustomerOrder {
    @Id
    private String id;
    private List<Object> items;
    private double cost;
    private String customerEmail;
}
