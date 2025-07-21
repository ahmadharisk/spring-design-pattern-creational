package com.peppo.spring.creational.factory.abstracts.bcaklikplay;

import com.peppo.spring.creational.factory.abstracts.GetBalancePaymentRequest;
import com.peppo.spring.creational.factory.abstracts.PaymentMethod;
import lombok.Data;

@Data
public class BCAKlikPayGetBalancePaymentRequest implements GetBalancePaymentRequest {
    private String userId;

    @Override
    public PaymentMethod getPaymentMethod() {
        return PaymentMethod.BCA_KLIKPAY;
    }
}
