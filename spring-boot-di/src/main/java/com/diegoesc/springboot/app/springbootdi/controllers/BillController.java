package com.diegoesc.springboot.app.springbootdi.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.diegoesc.springboot.app.springbootdi.models.domain.Bill;

@Controller
@RequestMapping("/bill")
public class BillController {
    @Autowired
    private Bill bill;
    @GetMapping("/see")
    public String see(Model model) {
        model.addAttribute("bill", bill);
        model.addAttribute("title", "Bill Example with dependency injection");
        return "bill/see";
    }
}
