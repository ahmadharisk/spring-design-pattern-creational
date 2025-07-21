package com.peppo.spring.creational.factory.abstracts.gopay;

import com.peppo.spring.creational.factory.abstracts.GetBalancePaymentRequest;
import com.peppo.spring.creational.factory.abstracts.PaymentMethod;
import lombok.Data;

@Data
public class GoPayGetBalancePaymentRequest implements GetBalancePaymentRequest {
    private String userId;

    @Override
    public PaymentMethod getPaymentMethod() {
        return PaymentMethod.GOPAY;
    }
}
