package com.atlong.springcloud.server;

import com.atlong.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Param;

public interface PaymentServer {

    public int create(Payment payment);

    public Payment getPaymentByID( Long id);
}
