package com.peppo.spring.creational.factory.abstracts.creditcard;

import com.peppo.spring.creational.factory.abstracts.CancelPaymentRequest;
import com.peppo.spring.creational.factory.abstracts.PaymentMethod;
import lombok.Data;

@Data
public class CreditCardCancelPaymentRequest implements CancelPaymentRequest {
    private String id;

    @Override
    public PaymentMethod getPaymentMethod() {
        return PaymentMethod.CREDIT_CARD;
    }
}
