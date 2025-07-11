package com.example.hospital.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainPageController {

    @GetMapping("/mainpage")
    public String showMainPage() {
        return "mainpage";  // This will load mainpage.html from templates
    }
}
