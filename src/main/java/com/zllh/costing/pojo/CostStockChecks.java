package com.zllh.costing.pojo;


public class CostStockChecks {
    private String stockChecksId;

    private String ingredientId;

    private String storageId;

    private Double rSum;

    private Double cSum;

    private Double sSum;

    private Double avgPrice;

    private Double freezeMem;

    public String getStockChecksId() {
        return stockChecksId;
    }

    public void setStockChecksId(String stockChecksId) {
        this.stockChecksId = stockChecksId == null ? null : stockChecksId.trim();
    }

    public String getIngredientId() {
        return ingredientId;
    }

    public void setIngredientId(String ingredientId) {
        this.ingredientId = ingredientId == null ? null : ingredientId.trim();
    }

    public String getStorageId() {
        return storageId;
    }

    public void setStorageId(String storageId) {
        this.storageId = storageId == null ? null : storageId.trim();
    }

    public Double getrSum() {
        return rSum;
    }

    public void setrSum(Double rSum) {
        this.rSum = rSum;
    }

    public Double getcSum() {
        return cSum;
    }

    public void setcSum(Double cSum) {
        this.cSum = cSum;
    }

    public Double getsSum() {
        return sSum;
    }

    public void setsSum(Double sSum) {
        this.sSum = sSum;
    }

    public Double getAvgPrice() {
        return avgPrice;
    }

    public void setAvgPrice(Double avgPrice) {
        this.avgPrice = avgPrice;
    }

    public Double getFreezeMem() {
        return freezeMem;
    }

    public void setFreezeMem(Double freezeMem) {
        this.freezeMem = freezeMem;
    }
}