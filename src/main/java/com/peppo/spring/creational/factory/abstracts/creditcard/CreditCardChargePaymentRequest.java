package com.peppo.spring.creational.factory.abstracts.creditcard;

import com.peppo.spring.creational.factory.abstracts.ChargePaymentRequest;
import com.peppo.spring.creational.factory.abstracts.PaymentMethod;
import lombok.Data;

@Data
public class CreditCardChargePaymentRequest implements ChargePaymentRequest {
    private String id;
    private Long amount;

    @Override
    public Long getFee() {
        return getAmount() * 5 / 100;
    }

    @Override
    public PaymentMethod getPaymentMethod() {
        return PaymentMethod.CREDIT_CARD;
    }
}
