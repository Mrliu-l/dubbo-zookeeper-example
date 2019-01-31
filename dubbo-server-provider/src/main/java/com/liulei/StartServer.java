package com.liulei;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * @author liu_l
 * @email: liu_lei_programmer@163.com
 * @time 2019/1/31 17:12
 * @Description: 描述:
 */
public class StartServer {
    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("dubbo-server.xml");
        System.in.read();
    }
}
