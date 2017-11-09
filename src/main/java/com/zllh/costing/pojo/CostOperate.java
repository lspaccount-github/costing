package com.zllh.costing.pojo;

import java.util.Date;

public class CostOperate {
    private String operateId;

    private Date crateTime;

    private Integer operateType;

    private String operateName;

    private String operatePid;

    private Integer manageType;

    public String getOperateId() {
        return operateId;
    }

    public void setOperateId(String operateId) {
        this.operateId = operateId == null ? null : operateId.trim();
    }

    public Date getCrateTime() {
        return crateTime;
    }

    public void setCrateTime(Date crateTime) {
        this.crateTime = crateTime;
    }

    public Integer getOperateType() {
        return operateType;
    }

    public void setOperateType(Integer operateType) {
        this.operateType = operateType;
    }

    public String getOperateName() {
        return operateName;
    }

    public void setOperateName(String operateName) {
        this.operateName = operateName == null ? null : operateName.trim();
    }

    public String getOperatePid() {
        return operatePid;
    }

    public void setOperatePid(String operatePid) {
        this.operatePid = operatePid == null ? null : operatePid.trim();
    }

    public Integer getManageType() {
        return manageType;
    }

    public void setManageType(Integer manageType) {
        this.manageType = manageType;
    }
}