package com.example.learningspring.controllers;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class PostController {
  @RequestMapping(path = "/post", method = RequestMethod.GET)
  @ResponseBody
  public String index() {
    return "index page";
  }
    @RequestMapping(path = "/post/{id}", method = RequestMethod.GET)
    @ResponseBody
    public String PostID() {
      return "view an individual post\n";
    }
  @RequestMapping(path = "/posts/create", method = RequestMethod.GET)
  @ResponseBody
  public String create() {
    return "creation form here";
  }
  @RequestMapping(path = "/posts/create", method = RequestMethod.POST)
  @ResponseBody
  public String post() {
    return "creation form here";
  }
}

