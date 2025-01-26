package com.github.adetiamarhadi.springboot_swagger.dto.response;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class OrderResponse {

    private String orderId;
    private BigDecimal totalAmount;
    private LocalDateTime createdAt;

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public BigDecimal getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(BigDecimal totalAmount) {
        this.totalAmount = totalAmount;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }
}
