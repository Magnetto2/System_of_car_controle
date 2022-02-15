package com.portfolio.system_of_car_control.helpdesc.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelpController {

    @GetMapping("helpdesc")
    public String helpdesc(){
        return "helpdesk/index";
    }
}
