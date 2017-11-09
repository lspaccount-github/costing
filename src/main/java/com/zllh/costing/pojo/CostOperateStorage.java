package com.zllh.costing.pojo;


public class CostOperateStorage {
    private String operateStorageId;

    private String storageId;

    private String operateId;

    public String getOperateStorageId() {
        return operateStorageId;
    }

    public void setOperateStorageId(String operateStorageId) {
        this.operateStorageId = operateStorageId == null ? null : operateStorageId.trim();
    }

    public String getStorageId() {
        return storageId;
    }

    public void setStorageId(String storageId) {
        this.storageId = storageId == null ? null : storageId.trim();
    }

    public String getOperateId() {
        return operateId;
    }

    public void setOperateId(String operateId) {
        this.operateId = operateId == null ? null : operateId.trim();
    }
}