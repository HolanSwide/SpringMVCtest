package com.holanswide.controller;

import com.holanswide.model.User;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author ：holan
 * @description：TODO
 * @date ：2022/6/22 11:12
 */

@Controller
@RequestMapping("/helloii")
public class HelloII {
    @RequestMapping("/do")
    public String doHelloii(Model model) {
        model.addAttribute("msg","Hello II");
        model.addAttribute("user",new ClassPathXmlApplicationContext("spring-config.xml").getBean("user", User.class));
        return "hello";
    }
}

/*  此处指向的模板与 Hello.java 指向的模板是同一个，然而显示结果是各自正确导向的结果
 *  说明： 视图是被复用的，而控制器与视图之间是弱偶合关系。
 */
