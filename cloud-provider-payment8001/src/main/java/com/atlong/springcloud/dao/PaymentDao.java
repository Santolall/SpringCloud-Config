package com.atlong.springcloud.dao;

import com.atlong.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface PaymentDao {

    public int create(Payment payment);

    public Payment getPaymentByID(@Param("id") Long id);
}
