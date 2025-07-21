package com.peppo.spring.creational.factory.abstracts;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

@SpringBootTest(classes = AbstractsFactoryApplication.class)
class AbstractsFactoryApplicationTest {

    @Autowired
    private ApplicationContext applicationContext;

    public void charge(PaymentFactory paymentFactory) {
        ChargePaymentRequest request = paymentFactory.createChargeRequest();
        request.setId("XXX");
        request.setAmount(1_000_000L);

        // send to payment gateway
        System.out.println(request);
    }

    public void cancel(PaymentFactory paymentFactory) {
        CancelPaymentRequest request = paymentFactory.createCancelRequest();
        request.setId("XXX");

        // send to payment gateway
        System.out.println(request);
    }

    public Long getBalance(PaymentFactory paymentFactory) {
        try {
            GetBalancePaymentRequest request = paymentFactory.createGetBalanceRequest();
            request.setUserId("ID1");

            System.out.println(request);
            // send to payment gateway
            return 1_000L;
        } catch (UnsupportedOperationException e) {
            return 0L;
        }

    }

    @Test
    void testAbstractsFactory() {
        PaymentFactory paymentFactoryCreditCard = applicationContext.getBean(CreditCardPaymentFactory.class);
        PaymentFactory paymentFactoryBCA = applicationContext.getBean(BcaKlikPayPaymentFactory.class);
        PaymentFactory paymentFactoryGopay = applicationContext.getBean(GopayPaymentFactory.class);

        charge(paymentFactoryCreditCard);
        charge(paymentFactoryBCA);
        charge(paymentFactoryGopay);
    }
}