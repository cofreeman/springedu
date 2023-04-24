package com.example.springedu.controller;

import java.util.stream.IntStream;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {

    @GetMapping("/hello")
    public String hello(Model model) {
        System.out.println("첫번쨰 스프링 부트 테스트~!");
        model.addAttribute("data", "Spring Boot!!");
        model.addAttribute("array", IntStream.of(1, 2, 3, 4, 5, 6).toArray());

        return "hello";
    }

}
