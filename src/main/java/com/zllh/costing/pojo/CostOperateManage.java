package com.zllh.costing.pojo;

public class CostOperateManage {
    private String operateManageId;

    private String operateId;

    private String manageId;

    public String getOperateManageId() {
        return operateManageId;
    }

    public void setOperateManageId(String operateManageId) {
        this.operateManageId = operateManageId == null ? null : operateManageId.trim();
    }

    public String getOperateId() {
        return operateId;
    }

    public void setOperateId(String operateId) {
        this.operateId = operateId == null ? null : operateId.trim();
    }

    public String getManageId() {
        return manageId;
    }

    public void setManageId(String manageId) {
        this.manageId = manageId == null ? null : manageId.trim();
    }
}