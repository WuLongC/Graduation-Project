package com.grapro.orderandorder.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;
import java.io.Serializable;

/**
 * (Food)实体类
 *
 * @author makejava
 * @since 2020-04-01 13:31:16
 */
@Data
@Entity
public class Food {
    /**
     * 菜品id
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer fid;
    /**
     * 菜品名字
     */
    private String name;
    /**
     * 创建时间
     */
    private Date createtime;
    /**
     * 更新时间
     */
    private Date updatetime;
    /**
     * 描述
     */
    private String description;
    /**
     * 单价price
     */
    private Double price;
}
