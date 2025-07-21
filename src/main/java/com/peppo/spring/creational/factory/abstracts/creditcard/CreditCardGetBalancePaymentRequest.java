package com.peppo.spring.creational.factory.abstracts.creditcard;

import com.peppo.spring.creational.factory.abstracts.GetBalancePaymentRequest;
import com.peppo.spring.creational.factory.abstracts.PaymentMethod;
import lombok.Data;

@Data
public class CreditCardGetBalancePaymentRequest implements GetBalancePaymentRequest {
    private String userId;

    @Override
    public PaymentMethod getPaymentMethod() {
        return PaymentMethod.CREDIT_CARD;
    }
}
