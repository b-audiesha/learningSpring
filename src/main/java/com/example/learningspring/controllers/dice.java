package com.example.learningspring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class dice {

  @GetMapping("/roll-dice")
  public String rollDice() {
    return "roll-dice";
  }
}

