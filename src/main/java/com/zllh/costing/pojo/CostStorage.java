package com.zllh.costing.pojo;

public class CostStorage {
    private String storageId;

    private String operateId;

    private String storageName;

    private String storageAdress;

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

    public String getStorageName() {
        return storageName;
    }

    public void setStorageName(String storageName) {
        this.storageName = storageName == null ? null : storageName.trim();
    }

    public String getStorageAdress() {
        return storageAdress;
    }

    public void setStorageAdress(String storageAdress) {
        this.storageAdress = storageAdress == null ? null : storageAdress.trim();
    }
}