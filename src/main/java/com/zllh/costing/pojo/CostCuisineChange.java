package com.zllh.costing.pojo;

/**
 * 菜品替换表
 * @author wangteng
 *
 */
public class CostCuisineChange {
	/*替换编号*/
    private String cuisineChangeId;
	/*替换菜品编号*/
    private String cuisineIdBefore;
	/*目标菜品编号*/
    private String cuisineIdAfter;

    public String getCuisineChangeId() {
        return cuisineChangeId;
    }

    public void setCuisineChangeId(String cuisineChangeId) {
        this.cuisineChangeId = cuisineChangeId == null ? null : cuisineChangeId.trim();
    }

    public String getCuisineIdBefore() {
        return cuisineIdBefore;
    }

    public void setCuisineIdBefore(String cuisineIdBefore) {
        this.cuisineIdBefore = cuisineIdBefore == null ? null : cuisineIdBefore.trim();
    }

    public String getCuisineIdAfter() {
        return cuisineIdAfter;
    }

    public void setCuisineIdAfter(String cuisineIdAfter) {
        this.cuisineIdAfter = cuisineIdAfter == null ? null : cuisineIdAfter.trim();
    }
}