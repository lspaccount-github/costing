package com.zllh.costing.pojo;

/**
 * 菜品食材关系表
 * @author wangteng
 *
 */
public class CostCuisineIngredient {
	/*菜品食材关系编号*/
    private String ciId;
	/*食材编号*/
    private String ingredientId;
	/*菜品编号*/
    private String cuisineId;
	/*用料类型*/
    private Long branch;
	/*用料占比*/
    private String materialsProportion;
	/*净含量*/
    private Double quantity;
	/*净含量单位*/
    private String quantityUnit;

    public String getCiId() {
        return ciId;
    }

    public void setCiId(String ciId) {
        this.ciId = ciId == null ? null : ciId.trim();
    }

    public String getIngredientId() {
        return ingredientId;
    }

    public void setIngredientId(String ingredientId) {
        this.ingredientId = ingredientId == null ? null : ingredientId.trim();
    }

    public String getCuisineId() {
        return cuisineId;
    }

    public void setCuisineId(String cuisineId) {
        this.cuisineId = cuisineId == null ? null : cuisineId.trim();
    }

    public Long getBranch() {
        return branch;
    }

    public void setBranch(Long branch) {
        this.branch = branch;
    }

    public String getMaterialsProportion() {
        return materialsProportion;
    }

    public void setMaterialsProportion(String materialsProportion) {
        this.materialsProportion = materialsProportion == null ? null : materialsProportion.trim();
    }

    public Double getQuantity() {
        return quantity;
    }

    public void setQuantity(Double quantity) {
        this.quantity = quantity;
    }

    public String getQuantityUnit() {
        return quantityUnit;
    }

    public void setQuantityUnit(String quantityUnit) {
        this.quantityUnit = quantityUnit == null ? null : quantityUnit.trim();
    }
}