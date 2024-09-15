package com.ruoyi.seckill.domain;

import java.util.Date;
import java.io.Serializable;

/**
 * 订单明细表(SeckillSaleItem)实体类
 *
 * @author makejava
 * @since 2024-09-15 20:37:40
 */
public class SeckillSaleItem implements Serializable {
    private static final long serialVersionUID = -60103850260924176L;
    /**
    * 订单明细id
    */
    private Long saleItemId;
    /**
    * 产品id
    */
    private Long itemId;
    /**
    * 产品单价
    */
    private Double saleItemPrice;
    /**
    * 秒杀数量
    */
    private Integer saleItemQuantity;
    /**
    * 订单明细状态
    */
    private String saleItemStatus;
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

    public Long getSaleItemId() {
        return saleItemId;
    }

    public void setSaleItemId(Long saleItemId) {
        this.saleItemId = saleItemId;
    }

    public Long getItemId() {
        return itemId;
    }

    public void setItemId(Long itemId) {
        this.itemId = itemId;
    }

    public Double getSaleItemPrice() {
        return saleItemPrice;
    }

    public void setSaleItemPrice(Double saleItemPrice) {
        this.saleItemPrice = saleItemPrice;
    }

    public Integer getSaleItemQuantity() {
        return saleItemQuantity;
    }

    public void setSaleItemQuantity(Integer saleItemQuantity) {
        this.saleItemQuantity = saleItemQuantity;
    }

    public String getSaleItemStatus() {
        return saleItemStatus;
    }

    public void setSaleItemStatus(String saleItemStatus) {
        this.saleItemStatus = saleItemStatus;
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
