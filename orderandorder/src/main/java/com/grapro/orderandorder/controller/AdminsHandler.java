package com.grapro.orderandorder.controller;

import com.grapro.orderandorder.repository.AdminsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/admins")
public class AdminsHandler {
    @Autowired
    private AdminsRepository adminsRepository;
}
