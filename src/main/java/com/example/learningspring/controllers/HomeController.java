package com.example.learningspring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {
  @GetMapping("/add/{num}/and/{num2}")
  @ResponseBody
  public String add(@PathVariable int num, @PathVariable String num2) {
    return num + " plus " + num2 + " = " + (num) + (num2 );
  }
}
