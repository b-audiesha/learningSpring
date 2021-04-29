package com.example.learningspring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
class HelloController {
  @GetMapping("/hello")  //does this equal hello.html?
  @ResponseBody
  public String hello() {
    return "Hello from Spring!";
  }

  @GetMapping("/hello/{name}")
  public String sayHello(@PathVariable String name, Model model) {
    model.addAttribute("name", name);
    return "hello";
  }

  @GetMapping("/join")
  public String showJoinForm() {
    return "join";
  }

  @PostMapping("/join")
  public String joinCohort(@RequestParam(name = "cohort") String cohort, Model model) {
    model.addAttribute("cohort", "Welcome to " + cohort + "!");
    return "join";
  }
//request mapping and get mapping do the same thing.
//Notice in the above example we also used the @RequestMapping annotation, which is just the longer version of @GetMapping. There, of course, also exists a @PostMapping annotation that tells the controller to respond to POST requests.

  @RequestMapping(path = "/increment/{number}", method = RequestMethod.GET)
  @ResponseBody
  public String addOne(@PathVariable int number) {
    return number + " plus one is " + (number + 1) + "!";
  }
}
