package com.kids.buyer.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Component
public class BuyerSupplierService {

    @Autowired private RestTemplate restTemplate;

   /* @Cacheable("myTest")*/
    public String test(){
        return restTemplate.getForObject("http://supplier-service/get", String.class);
    }

    @CacheEvict("myTest")
    public void cacheEvict(){
        //left empty intentionally
    }
}
