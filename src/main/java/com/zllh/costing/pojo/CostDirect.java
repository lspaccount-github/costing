package com.zllh.costing.pojo;

public class CostDirect {
    private String directId;

    private String directName;

    public String getDirectId() {
        return directId;
    }

    public void setDirectId(String directId) {
        this.directId = directId == null ? null : directId.trim();
    }

    public String getDirectName() {
        return directName;
    }

    public void setDirectName(String directName) {
        this.directName = directName == null ? null : directName.trim();
    }
}