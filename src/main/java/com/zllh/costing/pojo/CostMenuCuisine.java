package com.zllh.costing.pojo;

import java.util.Date;

public class CostMenuCuisine {
    private String mcId;

    private Date createTime;

    private String cuisineName;

    private Double price;

    private Integer estimationMem;

    private Integer productionMem;

    private Integer marketMem;

    private Double marketMoney;

    private Double estimatioCost;

    private Double productionCost;

    private Double marketCost;

    private Double realityMoney;

    private String mumuId;

    private String cuisineId;

    private Integer leastMem;

    private String seriesId;

    private String typeId;

    private Double loss;

    private Double suggestPrice;

    private String operateId;

    private Integer mcEffect;

    private String msgUrl;

    public String getMcId() {
        return mcId;
    }

    public void setMcId(String mcId) {
        this.mcId = mcId == null ? null : mcId.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getCuisineName() {
        return cuisineName;
    }

    public void setCuisineName(String cuisineName) {
        this.cuisineName = cuisineName == null ? null : cuisineName.trim();
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getEstimationMem() {
        return estimationMem;
    }

    public void setEstimationMem(Integer estimationMem) {
        this.estimationMem = estimationMem;
    }

    public Integer getProductionMem() {
        return productionMem;
    }

    public void setProductionMem(Integer productionMem) {
        this.productionMem = productionMem;
    }

    public Integer getMarketMem() {
        return marketMem;
    }

    public void setMarketMem(Integer marketMem) {
        this.marketMem = marketMem;
    }

    public Double getMarketMoney() {
        return marketMoney;
    }

    public void setMarketMoney(Double marketMoney) {
        this.marketMoney = marketMoney;
    }

    public Double getEstimatioCost() {
        return estimatioCost;
    }

    public void setEstimatioCost(Double estimatioCost) {
        this.estimatioCost = estimatioCost;
    }

    public Double getProductionCost() {
        return productionCost;
    }

    public void setProductionCost(Double productionCost) {
        this.productionCost = productionCost;
    }

    public Double getMarketCost() {
        return marketCost;
    }

    public void setMarketCost(Double marketCost) {
        this.marketCost = marketCost;
    }

    public Double getRealityMoney() {
        return realityMoney;
    }

    public void setRealityMoney(Double realityMoney) {
        this.realityMoney = realityMoney;
    }

    public String getMumuId() {
        return mumuId;
    }

    public void setMumuId(String mumuId) {
        this.mumuId = mumuId == null ? null : mumuId.trim();
    }

    public String getCuisineId() {
        return cuisineId;
    }

    public void setCuisineId(String cuisineId) {
        this.cuisineId = cuisineId == null ? null : cuisineId.trim();
    }

    public Integer getLeastMem() {
        return leastMem;
    }

    public void setLeastMem(Integer leastMem) {
        this.leastMem = leastMem;
    }

    public String getSeriesId() {
        return seriesId;
    }

    public void setSeriesId(String seriesId) {
        this.seriesId = seriesId == null ? null : seriesId.trim();
    }

    public String getTypeId() {
        return typeId;
    }

    public void setTypeId(String typeId) {
        this.typeId = typeId == null ? null : typeId.trim();
    }

    public Double getLoss() {
        return loss;
    }

    public void setLoss(Double loss) {
        this.loss = loss;
    }

    public Double getSuggestPrice() {
        return suggestPrice;
    }

    public void setSuggestPrice(Double suggestPrice) {
        this.suggestPrice = suggestPrice;
    }

    public String getOperateId() {
        return operateId;
    }

    public void setOperateId(String operateId) {
        this.operateId = operateId == null ? null : operateId.trim();
    }

    public Integer getMcEffect() {
        return mcEffect;
    }

    public void setMcEffect(Integer mcEffect) {
        this.mcEffect = mcEffect;
    }

    public String getMsgUrl() {
        return msgUrl;
    }

    public void setMsgUrl(String msgUrl) {
        this.msgUrl = msgUrl == null ? null : msgUrl.trim();
    }
}