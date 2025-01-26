package com.github.adetiamarhadi.springboot_swagger.dto.request;

import java.math.BigDecimal;

public class OrderRequest {

    private BigDecimal totalAmount;

    public BigDecimal getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(BigDecimal totalAmount) {
        this.totalAmount = totalAmount;
    }
}
