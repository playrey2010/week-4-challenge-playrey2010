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

    @RequestMapping("/github1")
    public String github1() {
        return "github1";
    }

    @RequestMapping("/github2")
    public String github2() {
        return "github2";
    }

    @RequestMapping("/prodesign1")
    public String proDesign1() {
        return "prodesign1";
    }

    @RequestMapping("/prodesign2")
    public String proDesign2() {
        return "prodesign2";
    }

    @RequestMapping("/corejava1")
    public String java1() {
        return "corejava1";
    }

    @RequestMapping("/corejava2")
    public String java2() {
        return "corejava2";
    }

    @RequestMapping("/oojava1")
    public String oojava1() {
        return "oojava1";
    }

    @RequestMapping("/oojava2")
    public String oojava2() {
        return "oojava2";
    }

    @RequestMapping("/webdesign1")
    public String webdesign1() {
        return "webdesign1";
    }

    @RequestMapping("/webdesign2")
    public String webdesign2() {
        return "webdesign2";
    }
}
