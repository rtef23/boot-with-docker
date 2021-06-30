package org.example.A.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequiredArgsConstructor
public class AController {
  private final RestTemplate restTemplate;

  @GetMapping("/hello")
  public String hello() {
    return "hello, i'm A Application";
  }

  @GetMapping("/say-to-b-application")
  public String sayToBApplication() {
    return restTemplate.getForObject("http://b-application:8002/hello", String.class);
//    return restTemplate.getForObject("http://host-b.com:8002/hello", String.class);
  }
}
