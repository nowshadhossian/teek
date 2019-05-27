package com.kids.buyer.controller;

import com.kids.buyer.service.BuyerSupplierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BuyerController {

    @Autowired private BuyerSupplierService buyerSupplierService;

    @GetMapping("/my-supplier")
    public String get(){
        return buyerSupplierService.test();
    }

    public String returnWeFailed(){
        return "we failed sorry";
    }

    @GetMapping("/evict-test")
    public void evictTest(){
        buyerSupplierService.cacheEvict();
    }


}
