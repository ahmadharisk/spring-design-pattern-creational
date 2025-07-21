package com.peppo.spring.creational.factory.abstracts.bcaklikplay;

import com.peppo.spring.creational.factory.abstracts.ChargePaymentRequest;
import com.peppo.spring.creational.factory.abstracts.PaymentMethod;
import lombok.Data;

@Data
public class BCAKlikPayChargePaymentRequest implements ChargePaymentRequest {
    private String id;
    private Long amount;

    @Override
    public Long getFee() {
        return 5000L;
    }

    @Override
    public PaymentMethod getPaymentMethod() {
        return PaymentMethod.BCA_KLIKPAY;
    }
}
