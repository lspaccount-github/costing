package com.zllh.costing.pojo;

import java.util.Date;

public class CostIngredientRecord {
    private String id;

    private String stockChecksId;

    private String storageId;

    private Date createTime;

    private Integer stockType;

    private Double quantity;

    private Double price;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getStockChecksId() {
        return stockChecksId;
    }

    public void setStockChecksId(String stockChecksId) {
        this.stockChecksId = stockChecksId == null ? null : stockChecksId.trim();
    }

    public String getStorageId() {
        return storageId;
    }

    public void setStorageId(String storageId) {
        this.storageId = storageId == null ? null : storageId.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getStockType() {
        return stockType;
    }

    public void setStockType(Integer stockType) {
        this.stockType = stockType;
    }

    public Double getQuantity() {
        return quantity;
    }

    public void setQuantity(Double quantity) {
        this.quantity = quantity;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}