package com.vinamra.expenseManager.expenseManager.domain;

import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WebController {


    @RequestMapping("/")
    public String welcome() {
        return "index";
    }

}