package com.portfolio.system_of_car_control;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ApplicationController {



    @GetMapping("/index")
    public String home(){
        return "index";
    }

    @GetMapping("/fleet")
    public String fleet(){
        return "/fleet/index";
    }

    @GetMapping("/accounts")
    public String account(){
        return "/accounts/index";
    }


    @GetMapping("/hr")
    public String widget(){
        return "/hr/index";
    }


    @GetMapping("/helpdesk")
    public String helpdesk(){
        return "/helpdesk/index";
    }


    @GetMapping("/parameters")
    public String param(){
        return "/parameters/index";
    }

    @GetMapping("/payroll")
    public String payroll(){
        return "/payroll/index";
    }





}
