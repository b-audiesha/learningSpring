package com.example.learningspring.controllers;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class dice {
  @GetMapping("/roll-dice")
  public String rollDice() {
    return "roll-dice";
  }

}
