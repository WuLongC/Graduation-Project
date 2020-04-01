package com.grapro.orderandorder.repository;

import com.grapro.orderandorder.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Orderrepository extends JpaRepository<Order,Integer> {
}
