package com.devops.order_service_api_3.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Document( collation = "payments" )
public class Payment {
    @Id
    private String id;
    private Date paidDate;
    private String orderId;
    private String transactionId;
    private double amount;
    private String currency;
}
