package com.example.unit_converter.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class HomeController {
    @RequestMapping("/home")
    public String home() {
        return "index";
    }

    @RequestMapping("/metric")
    public String metric() {
        return "metric";
    }

    @RequestMapping("/imperial")
    public String imperial() {
        return "imperial";
    }
}
