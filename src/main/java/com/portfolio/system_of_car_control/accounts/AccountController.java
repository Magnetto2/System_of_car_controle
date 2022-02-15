package com.portfolio.system_of_car_control.accounts;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AccountController {

    @GetMapping("account")
    public String helpdesc(){
        return "accounts/index";
    }
}
