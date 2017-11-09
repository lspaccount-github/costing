package com.zllh.costing.pojo;

public class CostUserRoseOperateManage {
    private String uROMId;

    private String operateManageId;

    private String userRoseId;

    public String getuROMId() {
        return uROMId;
    }

    public void setuROMId(String uROMId) {
        this.uROMId = uROMId == null ? null : uROMId.trim();
    }

    public String getOperateManageId() {
        return operateManageId;
    }

    public void setOperateManageId(String operateManageId) {
        this.operateManageId = operateManageId == null ? null : operateManageId.trim();
    }

    public String getUserRoseId() {
        return userRoseId;
    }

    public void setUserRoseId(String userRoseId) {
        this.userRoseId = userRoseId == null ? null : userRoseId.trim();
    }
}