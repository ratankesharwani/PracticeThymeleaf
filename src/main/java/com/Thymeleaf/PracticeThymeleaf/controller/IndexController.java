package com.Thymeleaf.PracticeThymeleaf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

 @RequestMapping
    public String getString(Model model) {
           model.addAttribute("something","coming from the controller");
        return "index";
    }
}
