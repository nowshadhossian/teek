package com.kids.supplier.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SupplierController {

    @Value("${eureka.instance.instance-id}")
    private String instanceId;

    @Value("${server.port}")
    private String serverPort;

    @GetMapping("/get")
    public String get(){
        return List.of(1,2,3).toString() + " From instance: " + instanceId + " server port: " + serverPort;
    }

    @GetMapping("/instance")
    public String instance(){
        return "THis is the instance id: " + instanceId;
    }
}
