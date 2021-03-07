package com.qihui.sun.gmall.controller;

import com.qihui.sun.gmall.bean.UserAddress;
import com.qihui.sun.gmall.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class OrderController {

    @Autowired
    private OrderService orderService;

    @GetMapping("/initOrder")
    public List<UserAddress> initOrder(String userId){
        return orderService.initOrder(userId);
    }

}
