package com.zllh.costing.pojo;

import java.util.Date;

public class CostTemplate {
    private String templateId;

    private Date templateCrateTime;

    private String templateName;

    private String operateId;

    private Date templateStartTime;

    private Date templateEndTime;

    private Integer templateEffect;

    private String templatePid;

    private Integer week;

    private Integer type;

    public String getTemplateId() {
        return templateId;
    }

    public void setTemplateId(String templateId) {
        this.templateId = templateId == null ? null : templateId.trim();
    }

    public Date getTemplateCrateTime() {
        return templateCrateTime;
    }

    public void setTemplateCrateTime(Date templateCrateTime) {
        this.templateCrateTime = templateCrateTime;
    }

    public String getTemplateName() {
        return templateName;
    }

    public void setTemplateName(String templateName) {
        this.templateName = templateName == null ? null : templateName.trim();
    }

    public String getOperateId() {
        return operateId;
    }

    public void setOperateId(String operateId) {
        this.operateId = operateId == null ? null : operateId.trim();
    }

    public Date getTemplateStartTime() {
        return templateStartTime;
    }

    public void setTemplateStartTime(Date templateStartTime) {
        this.templateStartTime = templateStartTime;
    }

    public Date getTemplateEndTime() {
        return templateEndTime;
    }

    public void setTemplateEndTime(Date templateEndTime) {
        this.templateEndTime = templateEndTime;
    }

    public Integer getTemplateEffect() {
        return templateEffect;
    }

    public void setTemplateEffect(Integer templateEffect) {
        this.templateEffect = templateEffect;
    }

    public String getTemplatePid() {
        return templatePid;
    }

    public void setTemplatePid(String templatePid) {
        this.templatePid = templatePid == null ? null : templatePid.trim();
    }

    public Integer getWeek() {
        return week;
    }

    public void setWeek(Integer week) {
        this.week = week;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }
}