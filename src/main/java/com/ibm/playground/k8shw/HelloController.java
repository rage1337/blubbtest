package com.ibm.playground.k8shw;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class HelloController {


    @Value("${text}")
    private String message;

    @GetMapping("greet/{name}")
    public String greet(@PathVariable String name) {
        return message + " " + name;
    }
}
