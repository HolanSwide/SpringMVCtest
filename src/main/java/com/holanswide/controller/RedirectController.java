package com.holanswide.controller;

import com.holanswide.model.User;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author ：holan
 * @description：TODO
 * @date ：2022/6/22 17:40
 */

@Controller
@RequestMapping("/a")
public class RedirectController {
    @RequestMapping("/1")
    public String func1(Model model) {
        model.addAttribute("msg","Its MSG from Func1...");
        return "redirect:/a/2";
    }
    @RequestMapping("/2")
    public String func2(@RequestParam("msg") String msg, Model model) {
        System.out.println(msg);
        model.addAttribute("msg","Its MSG from Func2...");
        model.addAttribute("user",new ClassPathXmlApplicationContext("spring-config.xml").getBean("user", User.class));
        return "hello";
    }
}
