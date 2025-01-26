package com.github.adetiamarhadi.springboot_swagger.service;

import com.github.adetiamarhadi.springboot_swagger.dto.request.OrderRequest;
import com.github.adetiamarhadi.springboot_swagger.dto.response.OrderResponse;

public interface OrderService {
    OrderResponse getOrder(String orderId);
    String createOrder(OrderRequest orderRequest);
}
