package com.example.helloworldspringwebapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @GetMapping(produces= "text/html")
    public String sayHello () {
        return
                "<!DOCTYPE html>"+
                        "<html>"+
                        "	<head><title>Hello world!</title></head>"+
                        "	<body>Hello, BioTech!</body>"+
                        "</html>"
                ;
    }
}