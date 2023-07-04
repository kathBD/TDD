package com.practice.payments;

public interface PaymentGateway {

     PaymentResponse requestPayment(PaymentRequest request);
}
