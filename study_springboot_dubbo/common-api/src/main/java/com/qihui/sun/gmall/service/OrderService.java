package com.qihui.sun.gmall.service;

import com.qihui.sun.gmall.bean.UserAddress;

import java.util.List;

public interface OrderService {
    List<UserAddress> initOrder(String userId);
}
