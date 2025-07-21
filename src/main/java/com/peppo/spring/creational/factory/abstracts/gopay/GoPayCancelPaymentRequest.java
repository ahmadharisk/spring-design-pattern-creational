package com.peppo.spring.creational.factory.abstracts.gopay;

import com.peppo.spring.creational.factory.abstracts.CancelPaymentRequest;
import com.peppo.spring.creational.factory.abstracts.PaymentMethod;
import lombok.Data;

@Data
public class GoPayCancelPaymentRequest implements CancelPaymentRequest {
    private String id;

    @Override
    public PaymentMethod getPaymentMethod() {
        return PaymentMethod.GOPAY;
    }
}
