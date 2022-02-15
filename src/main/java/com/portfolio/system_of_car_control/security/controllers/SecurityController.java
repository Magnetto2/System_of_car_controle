package com.portfolio.system_of_car_control.security.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SecurityController {

    @GetMapping("/security")
    public String mainPayroll(){
        return "security/index";
    }
}
