package com.holanswide.test;

import com.holanswide.model.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author ：holan
 * @description：TODO
 * @date ：2022/6/21 22:43
 */

public class Model {
    @Test
    public void User() {
        // 1. 指定Spring配置文件名称
        String config = "spring-config.xml";
        // 2. 创建容器
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);
        User user = ac.getBean("user",User.class);
        System.out.println(user);
    }
}
