package com.devops.order_service_api_3.dto.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class RequestPaymentDto {
    private Date paidDate;
    private String orderId;
    private String transactionId;
    private double amount;
    private String currency;
}
