package com.zllh.costing.pojo;


/**
 * 管理单位表
 * @author wangteng
 *
 */
public class CostManage {
	/*管理单位编号*/
    private String manageId;
	/*管理单位名称*/
    private String manageName;

    public String getManageId() {
        return manageId;
    }

    public void setManageId(String manageId) {
        this.manageId = manageId == null ? null : manageId.trim();
    }

    public String getManageName() {
        return manageName;
    }

    public void setManageName(String manageName) {
        this.manageName = manageName == null ? null : manageName.trim();
    }
}