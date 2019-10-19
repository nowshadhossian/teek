package com.kids.buyer.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Component
public class BuyerSupplierService {

    @Autowired private RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "defaultTest")
    public String test(){
        return restTemplate.getForObject("http://supplier-service/get", String.class);
    }

    public String defaultTest(){
        return "I am front hysterix because supplier went down";
    }


    @CacheEvict("myTest")
    public void cacheEvict(){
        //left empty intentionally
    }
}
