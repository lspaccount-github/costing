package com.zllh.costing.pojo;


import java.util.Date;

public class CostIngredientNeeds {
    private String ingredientNeedsId;

    private String ingredientId;

    private String ingredientName;

    private String categoryId;

    private String ingredientUnit;

    private Date createTime;

    private Double sumNeedMem;

    private Double nowReallyMem;

    private Double orderMem;

    private Double dayPrice;

    private Integer priceType;

    private Double priceProportion;

    private String directId;

    public String getIngredientNeedsId() {
        return ingredientNeedsId;
    }

    public void setIngredientNeedsId(String ingredientNeedsId) {
        this.ingredientNeedsId = ingredientNeedsId == null ? null : ingredientNeedsId.trim();
    }

    public String getIngredientId() {
        return ingredientId;
    }

    public void setIngredientId(String ingredientId) {
        this.ingredientId = ingredientId == null ? null : ingredientId.trim();
    }

    public String getIngredientName() {
        return ingredientName;
    }

    public void setIngredientName(String ingredientName) {
        this.ingredientName = ingredientName == null ? null : ingredientName.trim();
    }

    public String getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId == null ? null : categoryId.trim();
    }

    public String getIngredientUnit() {
        return ingredientUnit;
    }

    public void setIngredientUnit(String ingredientUnit) {
        this.ingredientUnit = ingredientUnit == null ? null : ingredientUnit.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Double getSumNeedMem() {
        return sumNeedMem;
    }

    public void setSumNeedMem(Double sumNeedMem) {
        this.sumNeedMem = sumNeedMem;
    }

    public Double getNowReallyMem() {
        return nowReallyMem;
    }

    public void setNowReallyMem(Double nowReallyMem) {
        this.nowReallyMem = nowReallyMem;
    }

    public Double getOrderMem() {
        return orderMem;
    }

    public void setOrderMem(Double orderMem) {
        this.orderMem = orderMem;
    }

    public Double getDayPrice() {
        return dayPrice;
    }

    public void setDayPrice(Double dayPrice) {
        this.dayPrice = dayPrice;
    }

    public Integer getPriceType() {
        return priceType;
    }

    public void setPriceType(Integer priceType) {
        this.priceType = priceType;
    }

    public Double getPriceProportion() {
        return priceProportion;
    }

    public void setPriceProportion(Double priceProportion) {
        this.priceProportion = priceProportion;
    }

    public String getDirectId() {
        return directId;
    }

    public void setDirectId(String directId) {
        this.directId = directId == null ? null : directId.trim();
    }
}