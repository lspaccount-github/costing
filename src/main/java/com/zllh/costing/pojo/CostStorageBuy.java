package com.zllh.costing.pojo;


public class CostStorageBuy {
    private String storageBuyId;

    private String ingredientNeedsId;

    private String storageId;

    private Double actBuyNum;

    public String getStorageBuyId() {
        return storageBuyId;
    }

    public void setStorageBuyId(String storageBuyId) {
        this.storageBuyId = storageBuyId == null ? null : storageBuyId.trim();
    }

    public String getIngredientNeedsId() {
        return ingredientNeedsId;
    }

    public void setIngredientNeedsId(String ingredientNeedsId) {
        this.ingredientNeedsId = ingredientNeedsId == null ? null : ingredientNeedsId.trim();
    }

    public String getStorageId() {
        return storageId;
    }

    public void setStorageId(String storageId) {
        this.storageId = storageId == null ? null : storageId.trim();
    }

    public Double getActBuyNum() {
        return actBuyNum;
    }

    public void setActBuyNum(Double actBuyNum) {
        this.actBuyNum = actBuyNum;
    }
}