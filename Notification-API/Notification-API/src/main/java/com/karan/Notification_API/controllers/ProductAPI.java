package com.karan.Notification_API.controllers;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name ="PRODUCT-SERVICE")
public interface ProductAPI {


    @GetMapping("/product")
    public String invokeProductApi();

    @GetMapping("/product/{name}")
    public String invokeProductApiWithName(@PathVariable("name") String name);
}
