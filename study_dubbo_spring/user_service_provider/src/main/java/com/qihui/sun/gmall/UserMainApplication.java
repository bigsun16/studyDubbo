package com.qihui.sun.gmall;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

public class UserMainApplication {
    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext ios = new ClassPathXmlApplicationContext("provider.xml");
        ios.start();
        System.in.read();
    }
}
