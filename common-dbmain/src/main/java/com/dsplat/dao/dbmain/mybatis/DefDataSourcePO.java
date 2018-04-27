package com.dsplat.dao.dbmain.mybatis;

import java.io.Serializable;
import java.util.Date;

public class DefDataSourcePO implements Serializable {
    private String dataSoureceKey;

    private Integer intialSize;

    private Integer maxActive;

    private Integer maxIdle;

    private String driverClass;

    private String connectUrl;

    private String userName;

    private String passWord;

    private Date insertTime;

    private Date updateTime;

    private static final long serialVersionUID = 1L;

    public String getDataSoureceKey() {
        return dataSoureceKey;
    }

    public void setDataSoureceKey(String dataSoureceKey) {
        this.dataSoureceKey = dataSoureceKey == null ? null : dataSoureceKey.trim();
    }

    public Integer getIntialSize() {
        return intialSize;
    }

    public void setIntialSize(Integer intialSize) {
        this.intialSize = intialSize;
    }

    public Integer getMaxActive() {
        return maxActive;
    }

    public void setMaxActive(Integer maxActive) {
        this.maxActive = maxActive;
    }

    public Integer getMaxIdle() {
        return maxIdle;
    }

    public void setMaxIdle(Integer maxIdle) {
        this.maxIdle = maxIdle;
    }

    public String getDriverClass() {
        return driverClass;
    }

    public void setDriverClass(String driverClass) {
        this.driverClass = driverClass == null ? null : driverClass.trim();
    }

    public String getConnectUrl() {
        return connectUrl;
    }

    public void setConnectUrl(String connectUrl) {
        this.connectUrl = connectUrl == null ? null : connectUrl.trim();
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord == null ? null : passWord.trim();
    }

    public Date getInsertTime() {
        return insertTime;
    }

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}