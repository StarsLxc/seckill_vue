package com.ruoyi.seckill.domain;

import java.util.Date;
import java.io.Serializable;

/**
 * 秒杀活动表(SeckillEvent)实体类
 *
 * @author makejava
 * @since 2024-09-15 20:23:36
 */
public class SeckillEvent implements Serializable {
    private static final long serialVersionUID = -48444618173761501L;
    /**
    * 秒杀id
    */
    private Long seckillId;
    /**
    * 秒杀名称
    */
    private String seckillName;
    /**
    * 商品id
    */
    private Long itemId;
    /**
    * 秒杀价格
    */
    private Double seckillPrice;
    /**
    * 秒杀库存数
    */
    private Integer seckillStock;
    /**
    * 秒杀积分
    */
    private Integer seckillPoints;
    /**
    * 秒杀开始时间
    */
    private Date seckillStartTime;
    /**
    * 秒杀结束时间
    */
    private Date seckillEndTime;
    /**
    * 秒杀状态
    */
    private String seckillStatus;
    /**
    * 秒杀是否可以重复
    */
    private String seckillRepeatability;
    /**
    * 单个顾客秒杀限购数量
    */
    private Integer seckillLimitCustomer;
    /**
    * 单个ip秒杀限购数量
    */
    private Integer seckillLimitIp;
    /**
    * 单笔订单限购数量
    */
    private Integer seckillLimitSale;
    /**
    * 秒杀延迟支付时间
    */
    private Integer seckillDelayTime;
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
    * 逻辑删除（0正常，1停用）
    */
    private String deleteFlag;

    public Long getSeckillId() {
        return seckillId;
    }

    public void setSeckillId(Long seckillId) {
        this.seckillId = seckillId;
    }

    public String getSeckillName() {
        return seckillName;
    }

    public void setSeckillName(String seckillName) {
        this.seckillName = seckillName;
    }

    public Long getItemId() {
        return itemId;
    }

    public void setItemId(Long itemId) {
        this.itemId = itemId;
    }

    public Double getSeckillPrice() {
        return seckillPrice;
    }

    public void setSeckillPrice(Double seckillPrice) {
        this.seckillPrice = seckillPrice;
    }

    public Integer getSeckillStock() {
        return seckillStock;
    }

    public void setSeckillStock(Integer seckillStock) {
        this.seckillStock = seckillStock;
    }

    public Integer getSeckillPoints() {
        return seckillPoints;
    }

    public void setSeckillPoints(Integer seckillPoints) {
        this.seckillPoints = seckillPoints;
    }

    public Date getSeckillStartTime() {
        return seckillStartTime;
    }

    public void setSeckillStartTime(Date seckillStartTime) {
        this.seckillStartTime = seckillStartTime;
    }

    public Date getSeckillEndTime() {
        return seckillEndTime;
    }

    public void setSeckillEndTime(Date seckillEndTime) {
        this.seckillEndTime = seckillEndTime;
    }

    public String getSeckillStatus() {
        return seckillStatus;
    }

    public void setSeckillStatus(String seckillStatus) {
        this.seckillStatus = seckillStatus;
    }

    public String getSeckillRepeatability() {
        return seckillRepeatability;
    }

    public void setSeckillRepeatability(String seckillRepeatability) {
        this.seckillRepeatability = seckillRepeatability;
    }

    public Integer getSeckillLimitCustomer() {
        return seckillLimitCustomer;
    }

    public void setSeckillLimitCustomer(Integer seckillLimitCustomer) {
        this.seckillLimitCustomer = seckillLimitCustomer;
    }

    public Integer getSeckillLimitIp() {
        return seckillLimitIp;
    }

    public void setSeckillLimitIp(Integer seckillLimitIp) {
        this.seckillLimitIp = seckillLimitIp;
    }

    public Integer getSeckillLimitSale() {
        return seckillLimitSale;
    }

    public void setSeckillLimitSale(Integer seckillLimitSale) {
        this.seckillLimitSale = seckillLimitSale;
    }

    public Integer getSeckillDelayTime() {
        return seckillDelayTime;
    }

    public void setSeckillDelayTime(Integer seckillDelayTime) {
        this.seckillDelayTime = seckillDelayTime;
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
