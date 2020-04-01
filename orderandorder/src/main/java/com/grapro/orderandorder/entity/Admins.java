package com.grapro.orderandorder.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * 管理员表
 */
@Data
@Entity
public class Admins {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer aid;
    private String account;
    private String password;
    private String name;
    private String phonenum;
    //负责店铺（若为店铺负责人）
    private Integer sid;
    private String idcard;
    private String address;
    //权限等级
    private Integer permission;
}
