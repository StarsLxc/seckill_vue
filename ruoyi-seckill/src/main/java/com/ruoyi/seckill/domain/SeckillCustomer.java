package com.ruoyi.seckill.domain;

import java.util.Date;
import java.io.Serializable;

/**
 * 客户表(SeckillCustomer)实体类
 *
 * @author makejava
 * @since 2024-09-15 15:23:38
 */
public class SeckillCustomer implements Serializable {
    private static final long serialVersionUID = 337158093951818234L;
    /**
    * 客户id
    */
    private Long customerId;
    /**
    * 用户id
    */
    private Long userId;
    /**
    * 客户名称
    */
    private String customerName;
    /**
    * 客户电话
    */
    private String customerPhone;
    /**
    * 客户邮箱
    */
    private String customerEmail;
    /**
    * 客户积分
    */
    private Integer customerPoints;
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

    public Long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerPhone() {
        return customerPhone;
    }

    public void setCustomerPhone(String customerPhone) {
        this.customerPhone = customerPhone;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public Integer getCustomerPoints() {
        return customerPoints;
    }

    public void setCustomerPoints(Integer customerPoints) {
        this.customerPoints = customerPoints;
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
