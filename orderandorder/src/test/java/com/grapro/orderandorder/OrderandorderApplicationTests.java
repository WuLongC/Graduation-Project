package com.grapro.orderandorder;

import com.grapro.orderandorder.entity.Canteen;
import com.grapro.orderandorder.repository.CanteenRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class OrderandorderApplicationTests {

    @Autowired
    private CanteenRepository canteenRepository;
    @Test
    void contextLoads() {
        Canteen canteen = canteenRepository.findById(1).get();
        System.out.println(canteen);
    }


}
