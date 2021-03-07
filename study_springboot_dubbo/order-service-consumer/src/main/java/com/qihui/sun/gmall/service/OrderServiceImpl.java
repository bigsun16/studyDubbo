package com.qihui.sun.gmall.service;

import com.qihui.sun.gmall.bean.UserAddress;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {

    @Reference
    private UserService userService;

    public List<UserAddress> initOrder(String userId) {
       return userService.getUserAddressList(userId);
    }
}
