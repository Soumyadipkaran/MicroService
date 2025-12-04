package com.karan.Product_Server.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class ProductController {

    @Autowired
    private Environment env;

    @GetMapping("/product")
    public String placeOrder(){

        String port = env.getProperty("server.port");
        return "Order placed successfully :: Running on "+port+" Port";
    }

    @GetMapping("/product/{name}")
    public String orderWithName(@PathVariable String name){
        return "Order placed for "+ name +" Got it!!!";
    }

}
