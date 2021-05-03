package com.example.learningspring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class HomeController {
  @GetMapping("/home")
  @ResponseBody
  public String home() {
    return "home";
  } // this is the thymeleaf viewer equivalent to home.html
}
