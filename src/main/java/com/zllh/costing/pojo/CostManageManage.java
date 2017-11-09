package com.zllh.costing.pojo;


public class CostManageManage {
    private String manageManageId;

    private String manageId;

    private String cosManageId;

    public String getManageManageId() {
        return manageManageId;
    }

    public void setManageManageId(String manageManageId) {
        this.manageManageId = manageManageId == null ? null : manageManageId.trim();
    }

    public String getManageId() {
        return manageId;
    }

    public void setManageId(String manageId) {
        this.manageId = manageId == null ? null : manageId.trim();
    }

    public String getCosManageId() {
        return cosManageId;
    }

    public void setCosManageId(String cosManageId) {
        this.cosManageId = cosManageId == null ? null : cosManageId.trim();
    }
}