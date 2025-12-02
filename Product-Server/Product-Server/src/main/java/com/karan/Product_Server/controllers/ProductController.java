package com.karan.Product_Server.controllers;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {

    @GetMapping("/product")
    public String placeOrder(){
        return "Order placed successfully";
    }

    @GetMapping("/product/{name}")
    public String orderWithName(@PathVariable String name){
        return "Order placed for "+ name +" Got it!!!";
    }

}
