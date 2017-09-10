package com.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created 2016-11-04 17:32:43
 *
 * @author Michael.Zhang
 */
@RestController
public class HelloWorldController {

    @GetMapping("/")
    public String say() {
        return "Hello World!";
    }

}
