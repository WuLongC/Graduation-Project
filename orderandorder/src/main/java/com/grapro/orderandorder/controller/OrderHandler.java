package com.grapro.orderandorder.controller;

import com.grapro.orderandorder.repository.Orderrepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/order")
public class OrderHandler {
    @Autowired
    private Orderrepository orderrepository;
}
