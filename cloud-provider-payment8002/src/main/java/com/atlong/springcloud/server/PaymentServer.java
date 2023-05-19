package com.atlong.springcloud.server;

import com.atlong.springcloud.entities.Payment;

public interface PaymentServer {

    public int create(Payment payment);

    public Payment getPaymentByID( Long id);
}
