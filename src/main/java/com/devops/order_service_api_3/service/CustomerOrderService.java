package com.devops.order_service_api_3.service;

import com.devops.order_service_api_3.dto.request.RequestCustomerOrderDto;
import com.devops.order_service_api_3.dto.response.ResponseCustomerOrderDto;
import com.devops.order_service_api_3.dto.response.paginate.ResponseCustomerOrderPaginateDto;

public interface CustomerOrderService {
    public void create(RequestCustomerOrderDto requestCustomerOrderDto);
    public void update(RequestCustomerOrderDto requestCustomerOrderDto,String id);
    public void delete(String id);
    public ResponseCustomerOrderDto findById(String id);
    public ResponseCustomerOrderPaginateDto findAll(String searchText,int page,int size);
}
