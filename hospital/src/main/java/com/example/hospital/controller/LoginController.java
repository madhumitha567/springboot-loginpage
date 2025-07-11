
package com.example.hospital.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {

    @GetMapping("/login")
    public String showLoginPage() {
        return "login"; // This should match login.html in templates/
    }

    @GetMapping("/logout-success")
    public String logoutPage() {
        return "logout"; // Optional: Create logout.html to show after logout
    }
}
