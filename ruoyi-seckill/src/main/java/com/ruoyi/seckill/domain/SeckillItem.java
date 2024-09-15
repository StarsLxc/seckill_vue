package com.ruoyi.seckill.domain;

import java.util.Date;
import java.io.Serializable;

/**
 * 产品表(SeckillItem)实体类
 *
 * @author makejava
 * @since 2024-09-15 20:52:29
 */
public class SeckillItem implements Serializable {
    private static final long serialVersionUID = -66926489125558299L;
    /**
    * 产品id
    */
    private Long itemId;
    /**
    * 产品名
    */
    private String itemName;
    /**
    * 产品编码
    */
    private String itemCode;
    /**
    * 产品价格
    */
    private Double itemPrice;
    /**
    * 库存总量
    */
    private Integer itemStore;
    /**
    * 是否正在销售，0正常，1下架
    */
    private String itemIsOnSale;
    /**
    * 商品是否参与秒杀，0可以，1不可以
    */
    private String itemIsSeckill;
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

    public Long getItemId() {
        return itemId;
    }

    public void setItemId(Long itemId) {
        this.itemId = itemId;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getItemCode() {
        return itemCode;
    }

    public void setItemCode(String itemCode) {
        this.itemCode = itemCode;
    }

    public Double getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(Double itemPrice) {
        this.itemPrice = itemPrice;
    }

    public Integer getItemStore() {
        return itemStore;
    }

    public void setItemStore(Integer itemStore) {
        this.itemStore = itemStore;
    }

    public String getItemIsOnSale() {
        return itemIsOnSale;
    }

    public void setItemIsOnSale(String itemIsOnSale) {
        this.itemIsOnSale = itemIsOnSale;
    }

    public String getItemIsSeckill() {
        return itemIsSeckill;
    }

    public void setItemIsSeckill(String itemIsSeckill) {
        this.itemIsSeckill = itemIsSeckill;
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
