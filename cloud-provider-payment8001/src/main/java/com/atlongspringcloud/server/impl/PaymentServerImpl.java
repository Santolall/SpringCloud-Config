package com.atlongspringcloud.server.impl;

import com.atlong.springcloud.entities.Payment;
import com.atlongspringcloud.dao.PaymentDao;
import com.atlongspringcloud.server.PaymentServer;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class PaymentServerImpl implements PaymentServer {

    @Resource
    private PaymentDao paymentDao;

    @Override
    public int create(Payment payment) {
        return paymentDao.create(payment);
    }

    @Override
    public Payment getPaymentByID(Long id) {
        return paymentDao.getPaymentByID(id);
    }
}
