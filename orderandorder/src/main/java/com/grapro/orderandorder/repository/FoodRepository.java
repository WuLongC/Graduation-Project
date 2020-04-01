package com.grapro.orderandorder.repository;

import com.grapro.orderandorder.entity.Food;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FoodRepository extends JpaRepository<Food,Integer> {
}
