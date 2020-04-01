package com.grapro.orderandorder.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;
import java.io.Serializable;

/**
 * (Shop)实体类
 *
 * @author makejava
 * @since 2020-04-01 13:31:32
 */
@Data
@Entity
public class Shop {
    /**
     * 店铺id
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer sid;
    /**
     * 创建时间
     */
    private Date createtime;
    /**
     * 更新时间
     */
    private Date updatetime;
    /**
     * 所属食堂
     */
    private Integer cid;
    /**
     * 店铺名字
     */
    private String name;
    /**
     * 店铺描述
     */
    private String description;
    /**
     * 是否开业
     */
    private Boolean isopen;
    /**
     * 营业时间
     */
    private Date startime;
    /**
     * 歇业时间
     */
    private Date endtime;
}
