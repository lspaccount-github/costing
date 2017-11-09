package com.zllh.costing.pojo;

public class CostTemplateMenu {
    private String templateMenuId;

    private String menuId;

    private String templateId;

    public String getTemplateMenuId() {
        return templateMenuId;
    }

    public void setTemplateMenuId(String templateMenuId) {
        this.templateMenuId = templateMenuId == null ? null : templateMenuId.trim();
    }

    public String getMenuId() {
        return menuId;
    }

    public void setMenuId(String menuId) {
        this.menuId = menuId == null ? null : menuId.trim();
    }

    public String getTemplateId() {
        return templateId;
    }

    public void setTemplateId(String templateId) {
        this.templateId = templateId == null ? null : templateId.trim();
    }
}