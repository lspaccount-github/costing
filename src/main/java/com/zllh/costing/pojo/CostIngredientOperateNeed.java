package com.zllh.costing.pojo;


public class CostIngredientOperateNeed {
    private String ingredientOperateNeedId;

    private String ingredientNeedsId;

    private String operateId;

    private String needMem;

    public String getIngredientOperateNeedId() {
        return ingredientOperateNeedId;
    }

    public void setIngredientOperateNeedId(String ingredientOperateNeedId) {
        this.ingredientOperateNeedId = ingredientOperateNeedId == null ? null : ingredientOperateNeedId.trim();
    }

    public String getIngredientNeedsId() {
        return ingredientNeedsId;
    }

    public void setIngredientNeedsId(String ingredientNeedsId) {
        this.ingredientNeedsId = ingredientNeedsId == null ? null : ingredientNeedsId.trim();
    }

    public String getOperateId() {
        return operateId;
    }

    public void setOperateId(String operateId) {
        this.operateId = operateId == null ? null : operateId.trim();
    }

    public String getNeedMem() {
        return needMem;
    }

    public void setNeedMem(String needMem) {
        this.needMem = needMem == null ? null : needMem.trim();
    }
}