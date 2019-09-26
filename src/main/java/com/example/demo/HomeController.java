package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String homepage() {
        return "homepage";
    }

    @RequestMapping("/bootcamp")
    public String bootcamp() {
        return "bootcamp";
    }

    @RequestMapping("/profile")
    public String profile() {
        return "profile";
    }

    @RequestMapping("/github")
    public String github() {
        return "github";
    }

    @RequestMapping("/prodesign")
    public String proDesign() {
        return "PD&A";
    }

    @RequestMapping("/corejava")
    public String java() {
        return "corejava";
    }

    @RequestMapping("/oojava")
    public String oojava() {
        return "oojava";
    }

    @RequestMapping("/webdesign")
    public String webdesign() {
        return "webdesign";
    }
}
