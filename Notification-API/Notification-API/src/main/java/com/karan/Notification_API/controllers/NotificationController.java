package com.karan.Notification_API.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.print.DocFlavor;

@RestController
public class NotificationController {

//    @Autowired
//    private RestTemplate restTemplate;

    @Autowired
    private ProductAPI productAPI;

    @GetMapping("/notification")
    public String notification(){
        return "Email Send to user";
    }

    //Not good for internal communication
//    @GetMapping("/notification/pro")
//    public String getPro(){
//        String s1 = "Hello From notification API :: \n";
//        String s2 = restTemplate.getForObject("http://localhost:9091/product", String.class);
//
//        return s1+s2;
//    }

    @GetMapping("/notification/pro")
    public String getPro(){
        String s1 = "Hello From notification API :: \n";
        String s2 = productAPI.invokeProductApi();

        return s1+s2;
    }

    @GetMapping("/notification/pro/{name}")
    public String getProName(@PathVariable String name){
        String s1 = "Hello From notification API :: \n";
        String s2 = productAPI.invokeProductApiWithName(name);

        return s1+s2;
    }
}
