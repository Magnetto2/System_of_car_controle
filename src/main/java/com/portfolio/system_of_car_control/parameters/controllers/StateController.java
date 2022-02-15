package com.portfolio.system_of_car_control.parameters.controllers;


import com.portfolio.system_of_car_control.parameters.models.Country;
import com.portfolio.system_of_car_control.parameters.models.State;
import com.portfolio.system_of_car_control.parameters.service.CountryService;
import com.portfolio.system_of_car_control.parameters.service.StateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class StateController {

    @Autowired
    private StateService stateService;
    @Autowired
    private CountryService countryService;



    public Model addModelAtribute(Model model){


         model.addAttribute("states", stateService.getAll());
         model.addAttribute("countries", countryService.getAll());

         return model;

    }

    @GetMapping("/parameters/states")
    public String findAll(Model model){
        addModelAtribute(model);
        return "/parameters/stateList";
    }



    @GetMapping("/parameters/stateAdd")
    public String addState(Model model){
        addModelAtribute(model);
        return "parameters/StateAdd";
    }

    @GetMapping("/parameters/state/{op}/{id}")
    public String editState(@PathVariable String op, @PathVariable Integer id, Model model){
        addModelAtribute(model);
        model.addAttribute("state", stateService.findById(id));

        return "parameters/stateEdit" + op;
    }







    @PostMapping("/parameters/states")
    public String addNew(State state){
        stateService.save(state);
        return "redirect:/parameters/states";
    }

    @RequestMapping(value = "/state/delete/{id}", method ={RequestMethod.GET, RequestMethod.DELETE})
    public String delete(@PathVariable Integer id){
        stateService.delete(id);
        return "redirect:/states";
    }







}
