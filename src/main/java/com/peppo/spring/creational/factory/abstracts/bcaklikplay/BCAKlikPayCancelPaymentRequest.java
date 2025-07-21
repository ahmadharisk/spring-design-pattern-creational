package com.peppo.spring.creational.factory.abstracts.bcaklikplay;

import com.peppo.spring.creational.factory.abstracts.CancelPaymentRequest;
import com.peppo.spring.creational.factory.abstracts.PaymentMethod;
import lombok.Data;

@Data
public class BCAKlikPayCancelPaymentRequest implements CancelPaymentRequest {
    private String id;

    @Override
    public PaymentMethod getPaymentMethod() {
        return PaymentMethod.BCA_KLIKPAY;
    }
}
