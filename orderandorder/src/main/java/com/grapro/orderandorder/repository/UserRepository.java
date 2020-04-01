package com.grapro.orderandorder.repository;

import com.grapro.orderandorder.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Integer> {
}
