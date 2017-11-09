package com.zllh.costing.pojo;

import java.util.Date;

/**
 * 食材表
 * @author wangteng
 *
 */
public class CostIngredient {
	/*食材编号*/
    private String ingredientId;
	/*管理单位id*/
    private String manageId;
	/*创建时间*/
    private Date crateTime;
	/*食材名称*/
    private String ingredientName;
	/*食材分类编号*/
    private String categoryId;
	/*食材单位*/
    private String ingredientUnit;
	/*是否可用*/
    private Integer ingredientEffect;
	/*备注*/
    private String ingredientRemark;

    public String getIngredientId() {
        return ingredientId;
    }

    public void setIngredientId(String ingredientId) {
        this.ingredientId = ingredientId == null ? null : ingredientId.trim();
    }

    public String getManageId() {
        return manageId;
    }

    public void setManageId(String manageId) {
        this.manageId = manageId == null ? null : manageId.trim();
    }

    public Date getCrateTime() {
        return crateTime;
    }

    public void setCrateTime(Date crateTime) {
        this.crateTime = crateTime;
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

    public Integer getIngredientEffect() {
        return ingredientEffect;
    }

    public void setIngredientEffect(Integer ingredientEffect) {
        this.ingredientEffect = ingredientEffect;
    }

    public String getIngredientRemark() {
        return ingredientRemark;
    }

    public void setIngredientRemark(String ingredientRemark) {
        this.ingredientRemark = ingredientRemark == null ? null : ingredientRemark.trim();
    }
}