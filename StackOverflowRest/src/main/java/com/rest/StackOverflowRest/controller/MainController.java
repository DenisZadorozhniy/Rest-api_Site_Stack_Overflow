package com.rest.StackOverflowRest.controller;

import com.rest.StackOverflowRest.model.SiteObj;
import com.rest.StackOverflowRest.service.StackOverflowService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class MainController {

    @Autowired
    public StackOverflowService service;

    @GetMapping("/")
    public String index(Model model){
        List<SiteObj> allObject = service.findAll();
        model.addAttribute("allObject",allObject);
        return "/index";
    }



}
