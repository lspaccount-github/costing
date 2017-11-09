package com.zllh.costing.pojo;

import java.util.Date;

public class CostMenu {
    private String menuId;

    private String menuName;

    private Date crateTime;

    private Integer menuEffect;

    private Integer allreay;

    private String operateId;

    private String menuModeId;

    private Date useTime;

    private Integer type;

    public String getMenuId() {
        return menuId;
    }

    public void setMenuId(String menuId) {
        this.menuId = menuId == null ? null : menuId.trim();
    }

    public String getMenuName() {
        return menuName;
    }

    public void setMenuName(String menuName) {
        this.menuName = menuName == null ? null : menuName.trim();
    }

    public Date getCrateTime() {
        return crateTime;
    }

    public void setCrateTime(Date crateTime) {
        this.crateTime = crateTime;
    }

    public Integer getMenuEffect() {
        return menuEffect;
    }

    public void setMenuEffect(Integer menuEffect) {
        this.menuEffect = menuEffect;
    }

    public Integer getAllreay() {
        return allreay;
    }

    public void setAllreay(Integer allreay) {
        this.allreay = allreay;
    }

    public String getOperateId() {
        return operateId;
    }

    public void setOperateId(String operateId) {
        this.operateId = operateId == null ? null : operateId.trim();
    }

    public String getMenuModeId() {
        return menuModeId;
    }

    public void setMenuModeId(String menuModeId) {
        this.menuModeId = menuModeId == null ? null : menuModeId.trim();
    }

    public Date getUseTime() {
        return useTime;
    }

    public void setUseTime(Date useTime) {
        this.useTime = useTime;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }
}