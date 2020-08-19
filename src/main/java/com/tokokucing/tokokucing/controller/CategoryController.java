package com.tokokucing.tokokucing.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CategoryController {
    @GetMapping("/catagories")
    public String getCatagories(){
        return "catagories";
    }
}
