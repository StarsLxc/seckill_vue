package com.ruoyi.seckill.domain;

import java.util.Date;
import java.io.Serializable;

/**
 * 订单表(SeckillSale)实体类
 *
 * @author makejava
 * @since 2024-09-15 20:36:48
 */
public class SeckillSale implements Serializable {
    private static final long serialVersionUID = 431851644496580805L;
    /**
    * 订单id
    */
    private Long saleId;
    /**
    * 订单编号
    */
    private String saleSn;
    /**
    * 顾客id
    */
    private Long customerId;
    /**
    * 秒杀单id
    */
    private Long seckillId;
    /**
    * 订单状态
    */
    private String saleStatus;
    /**
    * 下单时间
    */
    private Date saleTime;
    /**
    * 下单金额
    */
    private Double saleAmount;
    /**
    * 创建者
    */
    private String createBy;
    /**
    * 创建时间
    */
    private Date createTime;
    /**
    * 更新者
    */
    private String updateBy;
    /**
    * 更新时间
    */
    private Date updateTime;
    /**
    * 逻辑删除，0正常，1删除
    */
    private String deleteFlag;

    public Long getSaleId() {
        return saleId;
    }

    public void setSaleId(Long saleId) {
        this.saleId = saleId;
    }

    public String getSaleSn() {
        return saleSn;
    }

    public void setSaleSn(String saleSn) {
        this.saleSn = saleSn;
    }

    public Long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }

    public Long getSeckillId() {
        return seckillId;
    }

    public void setSeckillId(Long seckillId) {
        this.seckillId = seckillId;
    }

    public String getSaleStatus() {
        return saleStatus;
    }

    public void setSaleStatus(String saleStatus) {
        this.saleStatus = saleStatus;
    }

    public Date getSaleTime() {
        return saleTime;
    }

    public void setSaleTime(Date saleTime) {
        this.saleTime = saleTime;
    }

    public Double getSaleAmount() {
        return saleAmount;
    }

    public void setSaleAmount(Double saleAmount) {
        this.saleAmount = saleAmount;
    }

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getDeleteFlag() {
        return deleteFlag;
    }

    public void setDeleteFlag(String deleteFlag) {
        this.deleteFlag = deleteFlag;
    }

}
