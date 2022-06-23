package com.holanswide.controller;

import org.apache.ibatis.annotations.Param;
import org.junit.runners.Parameterized;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author ：holan
 * @description：TODO
 * @date ：2022/6/23 16:32
 */
@Controller
@RequestMapping("/restful")
public class RestfulController {
    @GetMapping("/1/{param}")
    // 路径参数 {param}，在方法参数前添加注解 @PathVariable 可以接收
    public String func1(Model model, @PathVariable int param) {
        System.out.println(param);
        return "hello";
    }
    @GetMapping("/2")
    // 通过 get 传值，在方法参数前添加注解 @RequestParam 可以接收
    public String func2(Model model, @RequestParam("msg") String msg) {
        System.out.println(msg);
        model.addAttribute("msg",msg);
        return "hello";
    }
}
