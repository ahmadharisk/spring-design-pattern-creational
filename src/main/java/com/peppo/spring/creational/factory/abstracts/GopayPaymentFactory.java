package com.peppo.spring.creational.factory.abstracts;

import com.peppo.spring.creational.factory.abstracts.gopay.GoPayCancelPaymentRequest;
import com.peppo.spring.creational.factory.abstracts.gopay.GoPayChargePaymentRequest;
import com.peppo.spring.creational.factory.abstracts.gopay.GoPayGetBalancePaymentRequest;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GopayPaymentFactory implements PaymentFactory {
    @Override
    public ChargePaymentRequest createChargeRequest() {
        return new GoPayChargePaymentRequest();
    }

    @Override
    public CancelPaymentRequest createCancelRequest() {
        return new GoPayCancelPaymentRequest();
    }

    @Override
    public GetBalancePaymentRequest createGetBalanceRequest() {
        return new GoPayGetBalancePaymentRequest();
    }
}
