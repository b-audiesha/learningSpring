package com.example.learningspring.controllers;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class PostController {

  @GetMapping("/posts")
  @ResponseBody
  public String index() {
    return "posts index page";
  }

  @GetMapping("/posts/{id}")
  @ResponseBody
  public String view() {
    return "view an individual post";
  }

  @GetMapping("/posts/create")
  @ResponseBody
  public String create() {
    return "view the form for creating a post";
  }

  @PostMapping("/posts/create")
  @ResponseBody
  public String newPost() {
    return "creating a new post";
  }
}
