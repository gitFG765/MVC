package com.art.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping(value = "/test1")
    public String home() {
        return "test";
    }

    @RequestMapping(value = "/tst")
    public String home1() {
        return "test";
    }

}
