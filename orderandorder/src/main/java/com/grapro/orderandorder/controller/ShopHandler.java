package com.grapro.orderandorder.controller;

import com.grapro.orderandorder.repository.ShopRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/shop")
public class ShopHandler {
    @Autowired
    private ShopRepository shopRepository;
}
