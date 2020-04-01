package com.grapro.orderandorder.controller;

import com.grapro.orderandorder.repository.FoodRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/food")
public class FoodHandler {
    @Autowired
    private FoodRepository foodRepository;
}
