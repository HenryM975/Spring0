package com.example0.servingwebcontent0.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {

    @GetMapping("/")//("/greeting")
    public String home(Model model){//(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
        model.addAttribute("title", "Hi");
        return "home";
    }

    @GetMapping("/p1")//("/greeting")
    public String p1(Model model){//(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
        //model.addAttribute("title", "Hi");
        return "test1";
    }

}
