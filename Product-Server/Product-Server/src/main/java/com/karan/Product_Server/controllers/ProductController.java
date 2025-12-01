package com.karan.Product_Server.controllers;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {

    @GetMapping
    public String placeOrder(){
        return "Order placed successfully";
    }

}
