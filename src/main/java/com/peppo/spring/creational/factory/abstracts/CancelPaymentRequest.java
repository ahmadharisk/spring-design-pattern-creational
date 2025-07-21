package com.peppo.spring.creational.factory.abstracts;

public interface CancelPaymentRequest {

    String getId();

    void setId(String id);

    PaymentMethod getPaymentMethod();
}
