package com.github.adetiamarhadi.springboot_swagger.service;

import com.github.adetiamarhadi.springboot_swagger.dto.request.OrderRequest;
import com.github.adetiamarhadi.springboot_swagger.dto.response.OrderResponse;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;

@Service
public class OrderServiceImpl implements OrderService {

    @Override
    public OrderResponse getOrder(String orderId) {

        OrderResponse orderResponse = new OrderResponse();
        orderResponse.setOrderId(orderId);
        orderResponse.setCreatedAt(LocalDateTime.now());
        orderResponse.setTotalAmount(new BigDecimal("1250300"));

        return orderResponse;
    }

    @Override
    public String createOrder(OrderRequest orderRequest) {
        return UUID.randomUUID().toString();
    }
}
