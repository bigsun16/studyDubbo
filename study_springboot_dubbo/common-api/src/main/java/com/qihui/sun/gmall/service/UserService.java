package com.qihui.sun.gmall.service;

import com.qihui.sun.gmall.bean.UserAddress;

import java.util.List;

public interface UserService {
    List<UserAddress> getUserAddressList(String userId);
}
