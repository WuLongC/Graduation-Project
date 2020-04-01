package com.grapro.orderandorder;

import com.grapro.orderandorder.entity.Admins;
import com.grapro.orderandorder.repository.AdminsRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class AdminsTest {
    @Autowired
    private AdminsRepository adminsRepository;

    @Test
    void findById(){
        Admins admins = adminsRepository.findById(1).get();
        System.out.println(admins);
    }
}
