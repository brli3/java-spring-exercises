package com.brli.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserController {
    @ResponseBody
    @RequestMapping("/save")
    public String save() {
        System.out.println("user save");
        return "{'model':'springmvc'}";
    }
}
