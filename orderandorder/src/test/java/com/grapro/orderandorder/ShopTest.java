package com.grapro.orderandorder;

import com.grapro.orderandorder.entity.Shop;
import com.grapro.orderandorder.repository.ShopRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class ShopTest {
    @Autowired
    private ShopRepository shopRepository;

    @Test
    void findById(){
        Shop shop = shopRepository.findById(1).get();
        System.out.println(shop);
    }
}
