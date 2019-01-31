package com.liulei;

/**
 * @author liu_l
 * @email: liu_lei_programmer@163.com
 * @time 2019/1/31 16:22
 * @Description: 描述: ISayHellow实现类
 */
public class SayHelloImpl implements ISayHello{
    @Override
    public String sayHello(String message) {
        System.out.println("服务端收到请求：" + message);
        return "我是server";
    }
}
