package com.grapro.orderandorder.controller;

import com.grapro.orderandorder.entity.Canteen;
import com.grapro.orderandorder.repository.CanteenRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/canteen")
public class CanteenHandler {
    @Autowired
    private CanteenRepository canteenRepository;

    @GetMapping("/findById/{id}")
    public Canteen findById(@PathVariable("id") Integer cid){
        return canteenRepository.findById(cid).get();
    }
}
