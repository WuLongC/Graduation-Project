package com.grapro.orderandorder.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

/**
 * (Order)实体类
 * 订单类
 * @author makejava
 * @since 2020-04-01 13:18:42
 */
@Data
@Entity
public class Order {
    /**
     * 订单id
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer orderid;
    /**
     * 点餐人手机
     */
    private String userPhone;
    /**
     * 取餐时间
     */
    private String takeouttime;
    /**
     * 创建时间
     */
    private Date createtime;
    /**
     * 菜品ID
     */
    private Integer fid;
    /**
     * 是否堂食
     */
    private Boolean istakeout;
    /**
     * 附加选择（辣度）
     */
    private String option;
    /**
     * 备注
     */
    private String note;
}
