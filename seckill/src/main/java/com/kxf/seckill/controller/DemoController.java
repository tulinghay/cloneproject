package com.kxf.seckill.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 测试
 *
 * @author Kxf
 * @create 2021/10/3,0003 22:13
 */
@Controller
@RequestMapping("/demo")
public class DemoController {

    /**
     * 测试页面跳转
     *
     * @param model
     * @return
     */
    @RequestMapping("hello")
    public String hello(Model model) {
        model.addAttribute("name", "kxf");
        return "hello";
    }
}
