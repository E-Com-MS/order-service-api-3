package com.devops.order_service_api_3.service.impl;

import com.devops.order_service_api_3.dto.request.RequestCustomerOrderDto;
import com.devops.order_service_api_3.dto.response.ResponseCustomerOrderDto;
import com.devops.order_service_api_3.dto.response.paginate.ResponseCustomerOrderPaginateDto;
import com.devops.order_service_api_3.service.CustomerOrderService;

public class CustomerOrderServiceImpl implements CustomerOrderService {
    @Override
    public void create(RequestCustomerOrderDto requestCustomerOrderDto) {

    }

    @Override
    public void update(RequestCustomerOrderDto requestCustomerOrderDto, String id) {

    }

    @Override
    public void delete(String id) {

    }

    @Override
    public ResponseCustomerOrderDto findById(String id) {
        return null;
    }

    @Override
    public ResponseCustomerOrderPaginateDto findAll(String searchText, int page, int size) {
        return null;
    }
}
