package com.atlong.SpringCloud.dao;

import com.atlong.SpringCloud.entities.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface PaymentDao {

    public int create(Payment payment);

    public Payment getPaymentByID(@Param("id") Long id);
}
