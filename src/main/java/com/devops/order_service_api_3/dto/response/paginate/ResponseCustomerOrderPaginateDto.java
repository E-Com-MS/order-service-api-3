package com.devops.order_service_api_3.dto.response.paginate;

import com.devops.order_service_api_3.dto.response.ResponseCustomerOrderDto;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ResponseCustomerOrderPaginateDto {
    private long count;
    private List<ResponseCustomerOrderDto> dataList;
}
