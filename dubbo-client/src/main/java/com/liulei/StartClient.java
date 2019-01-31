package com.liulei;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

/**
 * @author liu_l
 * @email: liu_lei_programmer@163.com
 * @time 2019/1/31 16:30
 * @Description: 描述:
 */
public class StartClient {
    public static void main(String[] args) throws IOException, InterruptedException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("dubbo-client.xml");
        for(int i = 0; i < 10; i++){
            ISayHello sayHello = (ISayHello) context.getBean("sayHello");
            String message = sayHello.sayHello("我是客户端");
            System.out.println(message);
            TimeUnit.MILLISECONDS.sleep(1000);
        }
        //System.in.read();
    }
}
