package com.rauulssanchezz.authadminstarter.admindashboard;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
@RequestMapping("/admin")
public class AdminDahsboardController {

    @GetMapping("")
    public String redirect() {
        return "redirect:/admin/dashboard";
    }

    @GetMapping("/dashboard")
    public String loadDashboard() {
        return "admin/dashboard";
    }
    
}
