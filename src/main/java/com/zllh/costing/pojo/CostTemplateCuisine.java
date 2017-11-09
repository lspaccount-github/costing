package com.zllh.costing.pojo;


/**
 * 模板明细表
 * @author wangteng
 *
 */
public class CostTemplateCuisine {
	/*模板明细编号*/
    private String mmcId;
	/*模板编号*/
    private String menuModeId;
	/*菜品编号*/
    private String cuisineId;
	/*最少制作量*/
    private Integer leastMem;
	/*预估份数*/
    private Integer estimationMem;

    public String getMmcId() {
        return mmcId;
    }

    public void setMmcId(String mmcId) {
        this.mmcId = mmcId == null ? null : mmcId.trim();
    }

    public String getMenuModeId() {
        return menuModeId;
    }

    public void setMenuModeId(String menuModeId) {
        this.menuModeId = menuModeId == null ? null : menuModeId.trim();
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

    public Integer getEstimationMem() {
        return estimationMem;
    }

    public void setEstimationMem(Integer estimationMem) {
        this.estimationMem = estimationMem;
    }
}