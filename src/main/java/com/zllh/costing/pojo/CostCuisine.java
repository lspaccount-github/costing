package com.zllh.costing.pojo;


import java.util.Date;

/**
 * 菜品表
 * @author wangteng
 *
 */
public class CostCuisine {
	/*菜品编号*/
    private String cuisineId;
	/*创建时间*/
    private Date crateTime;
	/*菜品名称*/
    private String cuisineName;
	/*菜系编号*/
    private String seriesId;
	/*菜品分类编号*/
    private String typeId;
	/*管理单位id*/
    private String manageId;
	/*加工记损*/
    private Double loss;
	/*建议零售价*/
    private Double suggestPrice;
	/*是否可用 0：不可用 1：可用*/
    private Integer cuisineEffect;
	/*图片路径*/
    private String msgUrl;
	/*预估份数*/
    private Integer estimateMem;

    public String getCuisineId() {
        return cuisineId;
    }

    public void setCuisineId(String cuisineId) {
        this.cuisineId = cuisineId == null ? null : cuisineId.trim();
    }

    public Date getCrateTime() {
        return crateTime;
    }

    public void setCrateTime(Date crateTime) {
        this.crateTime = crateTime;
    }

    public String getCuisineName() {
        return cuisineName;
    }

    public void setCuisineName(String cuisineName) {
        this.cuisineName = cuisineName == null ? null : cuisineName.trim();
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

    public String getManageId() {
        return manageId;
    }

    public void setManageId(String manageId) {
        this.manageId = manageId == null ? null : manageId.trim();
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

    public Integer getCuisineEffect() {
        return cuisineEffect;
    }

    public void setCuisineEffect(Integer cuisineEffect) {
        this.cuisineEffect = cuisineEffect;
    }

    public String getMsgUrl() {
        return msgUrl;
    }

    public void setMsgUrl(String msgUrl) {
        this.msgUrl = msgUrl == null ? null : msgUrl.trim();
    }

    public Integer getEstimateMem() {
        return estimateMem;
    }

    public void setEstimateMem(Integer estimateMem) {
        this.estimateMem = estimateMem;
    }
}