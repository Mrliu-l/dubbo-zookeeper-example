package com.liulei;

import com.alibaba.dubbo.container.Main;
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
        //启动方式一（测试启动）
        //ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("dubbo-server.xml");
        System.in.read();
        //启动方式二：使用dubbo框架中原声的netty框架入口
        //Main.main(args);默认使用spring容器启动服务
        Main.main(new String[]{"spring", "log4j"});//指定容器接口
    }
}
