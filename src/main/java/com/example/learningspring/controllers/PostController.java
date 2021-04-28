package com.example.learningspring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
@Controller
public class PostController {
  @GetMapping("/post")
  @ResponseBody
  public String hello() {
    return "Hello from Spring!";
  }
}

