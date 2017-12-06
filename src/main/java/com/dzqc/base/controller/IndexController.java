package com.dzqc.base.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@RequestMapping("/index")
@Controller
public class IndexController {

    /**
     * 页面：测试页面
     */
    @RequestMapping("/page/test")
    public ModelAndView toTest(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("test");
        modelAndView.addObject("word", "aircity");
        return modelAndView;
    }
}
