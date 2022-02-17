package com.example.binaertildecimal.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String bin2Dec(){
        return "bin2Dec";
    }

}
