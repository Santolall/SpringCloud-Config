package com.atlong.SpringCloud.server.impl;

import com.atlong.SpringCloud.dao.PaymentDao;
import com.atlong.SpringCloud.entities.Payment;
import com.atlong.SpringCloud.server.PaymentServer;
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
