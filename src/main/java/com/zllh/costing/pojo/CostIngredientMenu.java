package com.zllh.costing.pojo;

public class CostIngredientMenu {
    private String sMId;

    private String menuId;

    private String directId;

    public String getsMId() {
        return sMId;
    }

    public void setsMId(String sMId) {
        this.sMId = sMId == null ? null : sMId.trim();
    }

    public String getMenuId() {
        return menuId;
    }

    public void setMenuId(String menuId) {
        this.menuId = menuId == null ? null : menuId.trim();
    }

    public String getDirectId() {
        return directId;
    }

    public void setDirectId(String directId) {
        this.directId = directId == null ? null : directId.trim();
    }
}