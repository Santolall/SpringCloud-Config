package com.atlong.SpringCloud.server;

import com.atlong.SpringCloud.entities.Payment;
import org.apache.ibatis.annotations.Param;

public interface PaymentServer {

    public int create(Payment payment);

    public Payment getPaymentByID( Long id);
}
