package com.example.learningspring.controllers;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


@Controller
public class PostController {

  @GetMapping("/posts")
  @ResponseBody
  public String postsIndex() {
    return "posts index page";
  }

  @GetMapping("/posts/{id}")
  @ResponseBody
  public String postView() {
    return "view an individual post";
  }

  @GetMapping("/posts/create")
  @ResponseBody
  public String postForm() {
    return "view the form for creating a post";
  }

  @PostMapping("/posts/create")
  @ResponseBody
  public String createPost() {
    return "creating a new post";
  }
}
