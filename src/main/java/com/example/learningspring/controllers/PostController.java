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
      new Post("Here is a post", "Blah blah blah"),
      new Post("Here is a post", "Blah blah blah"),
      new Post("Here is a post", "Blah blah blah")
    ));
      vModel.addAttribute("posts", posts);
    return "posts/index";
  }

  @GetMapping("/posts/{id}")
  public String show(@PathVariable long id, Model vModel) {
    Post post = new Post("Test Title", "Test Body");
    vModel.addAttribute("id", id);
    vModel.addAttribute("post", post);
    return "posts/show";
  }

  @GetMapping("/posts/create")
  @ResponseBody
  public String create() {
    return "Create a New Post";
  }
  @PostMapping("/posts/create")
  @ResponseBody
  public String insert() {
    return "Insert a new post";
  }

}
