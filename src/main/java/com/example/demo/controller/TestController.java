package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/")
public class TestController {

    @GetMapping
    public ModelAndView index(ModelAndView model) {
        model.setViewName("pages/test");
        return model;
    }

    @GetMapping("/message")
    public ModelAndView message(ModelAndView model) {
        model.setViewName("pages/test");
        model.addObject("message", "message");
        return model;
    }
}
