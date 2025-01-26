package com.github.adetiamarhadi.springboot_swagger.controller;

import com.github.adetiamarhadi.springboot_swagger.dto.request.OrderRequest;
import com.github.adetiamarhadi.springboot_swagger.dto.response.OrderResponse;
import com.github.adetiamarhadi.springboot_swagger.service.OrderService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/orders")
public class OrderController {

    private final OrderService orderService;

    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @GetMapping("/{orderId}")
    public ResponseEntity<OrderResponse> getOrder(@PathVariable String orderId) {
        OrderResponse order = orderService.getOrder(orderId);
        return ResponseEntity.ok(order);
    }

    @PostMapping
    public ResponseEntity<String> submitOrder(@RequestBody OrderRequest orderRequest) {
        String orderId = orderService.createOrder(orderRequest);
        return ResponseEntity.ok(orderId);
    }
}
