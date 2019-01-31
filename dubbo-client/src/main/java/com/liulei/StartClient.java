package com.liulei;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author liu_l
 * @email: liu_lei_programmer@163.com
 * @time 2019/1/31 16:30
 * @Description: 描述:
 */
public class StartClient {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("dubbo-client.xml");
        ISayHello sayHello = (ISayHello) context.getBean("sayHello");
        String message = sayHello.sayHello("我是客户端");
        System.out.println(message);
    }
}
