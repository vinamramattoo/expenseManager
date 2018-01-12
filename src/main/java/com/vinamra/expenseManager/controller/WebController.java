package com.vinamra.expenseManager.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WebController {


    @RequestMapping("/")
    public String welcome() {
        return "index";
    }

    @RequestMapping(value = {"/test"})
    public String healthCheck() {
        return "welcome";
    }

}