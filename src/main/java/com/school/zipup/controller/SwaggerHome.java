package com.school.zipup.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SwaggerHome {
    @RequestMapping("/")
    public String home() {
        return "redirect:swagger-ui.html";
    }
}
