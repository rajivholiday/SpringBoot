package com.example.pro4_11.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class RedirectController {
    @GetMapping("/redirect")
    public RedirectView handler(@RequestParam String fruit) {
        if (fruit.equals("apple")) {
            return new RedirectView("/apple");
        }
        if (fruit.equals("banana")) {
            return new RedirectView("/banana");
        }
        if (fruit.equals("orange")) {
            return new RedirectView("/orange");
        }
        return new RedirectView("https://www.google.com/");
    }
}
