package com.example.learningspring.controllers;
import com.example.learningspring.models.Post;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Controller
public class PostController {

  @GetMapping("/posts")
  public String index(Model vModel) {
    List<Post> posts = new ArrayList<>(Arrays.asList(
      new Post("Here is a post", "Blah blah blah."),
      new Post("Here is a post", "Blah blah blah."),
      new Post("Here is a post", "Blah blah blah.")
    ));
      vModel.addAttribute("post, post");
    return "post/index";
  }

  @GetMapping("/posts/{id}")
  public String view() {
    return "/posts/show";
  }

  @GetMapping("/posts/create")
  public String create() {
    return "/posts/create";
  }

  @PostMapping("/posts/create")

  public String newPost() {
    return "creating a new post";
  }
}
