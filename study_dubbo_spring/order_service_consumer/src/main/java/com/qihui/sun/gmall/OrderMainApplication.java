package com.qihui.sun.gmall;

import com.qihui.sun.gmall.service.OrderService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class OrderMainApplication {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("consumer.xml");
        OrderService service = applicationContext.getBean(OrderService.class);
        service.initOrder("1");
    }
}
