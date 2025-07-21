package com.peppo.spring.creational.factory.abstracts.gopay;

import com.peppo.spring.creational.factory.abstracts.ChargePaymentRequest;
import com.peppo.spring.creational.factory.abstracts.PaymentMethod;
import lombok.Data;

@Data
public class GoPayChargePaymentRequest implements ChargePaymentRequest {
    private String id;
    private Long amount;

    @Override
    public Long getFee() {
        return 1000L;
    }

    @Override
    public PaymentMethod getPaymentMethod() {
        return PaymentMethod.GOPAY;
    }
}
