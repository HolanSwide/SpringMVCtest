package com.holanswide.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author ：holan
 * @description：TODO
 * @date ：2022/6/21 23:02
 */

@Controller
@RequestMapping("/hello")
public class Hello {
    @RequestMapping("/do")
    public String sayHello(Model model) {
        model.addAttribute("msg","Hello,World");
        return "hello";
    }
}

/*
 *  - @Controller是为了让Spring IOC容器初始化时自动扫描到；
 *  - @RequestMapping是为了映射请求路径，这里因为类与方法上都有映射所以访问时应该是/hello/do   ；
 *  - 方法中声明Model类型的参数是为了把Action中的数据带到视图中；
 *  - 方法返回的结果是视图的名称hello，加上配置文件中的前后缀变成WEB-INF/jsp/hello.jsp。
 */
