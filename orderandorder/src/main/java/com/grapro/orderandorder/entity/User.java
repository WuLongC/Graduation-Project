package com.grapro.orderandorder.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * (User)实体类
 *
 * @author makejava
 * @since 2020-04-01 13:31:49
 */
@Data
@Entity
public class User {
    /**
     * 用户ID
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer uid;

    private Integer appid;

    private String phone;

    private Integer openid;
}
