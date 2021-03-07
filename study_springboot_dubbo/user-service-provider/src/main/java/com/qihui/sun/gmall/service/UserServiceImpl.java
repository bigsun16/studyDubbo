package com.qihui.sun.gmall.service;

import com.qihui.sun.gmall.bean.UserAddress;
import org.apache.dubbo.config.annotation.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    public List<UserAddress> getUserAddressList(String userId) {
        UserAddress address1 = new UserAddress(1,"地址1","1","李老师","123456","Y");
        UserAddress address2 = new UserAddress(2,"地址2","1","王老师","654321","Y");
        return Arrays.asList(address1,address2);
    }
}
