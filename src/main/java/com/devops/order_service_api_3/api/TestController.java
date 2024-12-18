package com.devops.order_service_api_3.api;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/order-service/api/v1/tests")
public class TestController {
    @GetMapping()
    @PreAuthorize("hasRole('user')")
    public String test(){
        return "Order Service Running on Port(8003)";
    }
}
