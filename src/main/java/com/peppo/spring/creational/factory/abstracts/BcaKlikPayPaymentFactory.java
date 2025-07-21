package com.peppo.spring.creational.factory.abstracts;

import com.peppo.spring.creational.factory.abstracts.bcaklikplay.BCAKlikPayCancelPaymentRequest;
import com.peppo.spring.creational.factory.abstracts.bcaklikplay.BCAKlikPayChargePaymentRequest;
import com.peppo.spring.creational.factory.abstracts.bcaklikplay.BCAKlikPayGetBalancePaymentRequest;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BcaKlikPayPaymentFactory implements PaymentFactory {
    @Override
    public ChargePaymentRequest createChargeRequest() {
        return new BCAKlikPayChargePaymentRequest();
    }

    @Override
    public CancelPaymentRequest createCancelRequest() {
        return new BCAKlikPayCancelPaymentRequest();
    }

    @Override
    public GetBalancePaymentRequest createGetBalanceRequest() {
        return new BCAKlikPayGetBalancePaymentRequest();
    }
}
