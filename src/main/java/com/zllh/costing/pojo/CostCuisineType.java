package com.zllh.costing.pojo;


/**
 * 菜品分类表
 * @author wangteng
 *
 */
public class CostCuisineType {
	/*菜品分类编号*/
    private String typeId;
	/*分类名称*/
    private String typeName;
	/*是否可用 0：不可用 1：可用*/
    private Integer typeEffect;

    public String getTypeId() {
        return typeId;
    }

    public void setTypeId(String typeId) {
        this.typeId = typeId == null ? null : typeId.trim();
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName == null ? null : typeName.trim();
    }

    public Integer getTypeEffect() {
        return typeEffect;
    }

    public void setTypeEffect(Integer typeEffect) {
        this.typeEffect = typeEffect;
    }
}