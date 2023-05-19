package com.atlong.springcloud.server.impl;

import com.atlong.springcloud.dao.PaymentDao;
import com.atlong.springcloud.server.PaymentServer;
import com.atlong.springcloud.entities.Payment;

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
