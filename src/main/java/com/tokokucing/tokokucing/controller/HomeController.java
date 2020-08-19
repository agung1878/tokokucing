package com.tokokucing.tokokucing.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String getHome(){
        return "home";
    }

    @GetMapping("/product_page")
    public String getProduct(){
        return "product_page";
    }
}
