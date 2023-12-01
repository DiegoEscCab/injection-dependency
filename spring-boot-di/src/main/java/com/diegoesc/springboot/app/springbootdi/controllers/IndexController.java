package com.diegoesc.springboot.app.springbootdi.controllers;


import com.diegoesc.springboot.app.springbootdi.models.service.IService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

    @Autowired
    private IService service;

    @GetMapping({"", "/", "/index"})
    public String index(Model model) {

        model.addAttribute("object", service.operation());
        return "index";
    }

}
