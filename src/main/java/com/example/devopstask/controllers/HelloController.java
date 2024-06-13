package com.example.devopstask.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

  @GetMapping("/hello")
  public String sayHello() {
    return "Hello, boy!";
  }

  @GetMapping("/help")
  public String getHelp() {

    StringBuilder builder = new StringBuilder();
    builder.append("Добро пожаловать!\n");
    builder.append("Возможные команды:\n");
    builder.append("/append a='', b=''\n");
    builder.append("/substract a='', b=''\n");
    builder.append("/divide a='', b=''\n");
    builder.append("/multiply a='', b=''\n");

    return builder.toString();
  }

  @GetMapping("/bye")
  public String sayBye() {
    return "Bye bye, my friend";
  }

  @GetMapping("/addition")
  public double addition(@RequestParam("a") double a, @RequestParam("b") double b) {
    return a + b;
  }

  @GetMapping("/substract")
  public double substract(@RequestParam("a") double a, @RequestParam("b") double b) {
    return a - b;
  }

  @GetMapping("/divide")
  public double divide(@RequestParam("a") double a, @RequestParam("b") double b) {
    return a / b;
  }

  @GetMapping("/multiply")
  public double multiply(@RequestParam("a") double a, @RequestParam("b") double b) {
    return a * b;
  }
}
