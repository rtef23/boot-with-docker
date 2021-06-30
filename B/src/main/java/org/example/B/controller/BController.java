package org.example.B.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BController {
  @GetMapping("/hello")
  public String hello() {
    return "hello, i'm B Application";
  }
}
