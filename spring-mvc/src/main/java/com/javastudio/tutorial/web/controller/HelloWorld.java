package com.javastudio.tutorial.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloWorld {
    @RequestMapping("/welcome")
    public ModelAndView welcome(){
        String message = "<h1>Hello world!</h1>";
        return new ModelAndView("welcome", "message", message);
    }
}