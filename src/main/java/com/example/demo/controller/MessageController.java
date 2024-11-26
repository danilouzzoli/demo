package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MessageController {

  @GetMapping("/message")
  public String displayMessage(Model model) {

    model.addAttribute("message", "Hello, World!");
    
    System.out.println( "messaggio" );
    return "messageView";
  }

  @GetMapping("/message-without-gzip-compression")
  public String displayMessageV2(Model model) {

    model.addAttribute("message", "Hello, World!");
    return "messageView";
  }
}