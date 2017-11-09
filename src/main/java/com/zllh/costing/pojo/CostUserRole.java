package com.zllh.costing.pojo;

public class CostUserRole {
    private String userRoseId;

    private String roleid;

    private String userId;

    public String getUserRoseId() {
        return userRoseId;
    }

    public void setUserRoseId(String userRoseId) {
        this.userRoseId = userRoseId == null ? null : userRoseId.trim();
    }

    public String getRoleid() {
        return roleid;
    }

    public void setRoleid(String roleid) {
        this.roleid = roleid == null ? null : roleid.trim();
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }
}