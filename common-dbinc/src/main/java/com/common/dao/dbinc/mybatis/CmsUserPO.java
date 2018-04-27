package com.common.dao.dbinc.mybatis;

import java.io.Serializable;
import java.util.Date;

public class CmsUserPO implements Serializable {
    private Long id;

    private String loginName;

    private String loginPwd;

    private Date pwdValidateTime;

    private String nickname;

    private String status;

    private String mobile;

    private String email;

    private Long mcomId;

    private Long deptId;

    private Date insertTime;

    private Date updateTime;

    private String isSuperadmin;

    private String isAdmin2;

    private Long operatorId;

    private String userType;

    private Long tenantId;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName == null ? null : loginName.trim();
    }

    public String getLoginPwd() {
        return loginPwd;
    }

    public void setLoginPwd(String loginPwd) {
        this.loginPwd = loginPwd == null ? null : loginPwd.trim();
    }

    public Date getPwdValidateTime() {
        return pwdValidateTime;
    }

    public void setPwdValidateTime(Date pwdValidateTime) {
        this.pwdValidateTime = pwdValidateTime;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname == null ? null : nickname.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public Long getMcomId() {
        return mcomId;
    }

    public void setMcomId(Long mcomId) {
        this.mcomId = mcomId;
    }

    public Long getDeptId() {
        return deptId;
    }

    public void setDeptId(Long deptId) {
        this.deptId = deptId;
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

    public String getIsSuperadmin() {
        return isSuperadmin;
    }

    public void setIsSuperadmin(String isSuperadmin) {
        this.isSuperadmin = isSuperadmin == null ? null : isSuperadmin.trim();
    }

    public String getIsAdmin2() {
        return isAdmin2;
    }

    public void setIsAdmin2(String isAdmin2) {
        this.isAdmin2 = isAdmin2 == null ? null : isAdmin2.trim();
    }

    public Long getOperatorId() {
        return operatorId;
    }

    public void setOperatorId(Long operatorId) {
        this.operatorId = operatorId;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType == null ? null : userType.trim();
    }

    public Long getTenantId() {
        return tenantId;
    }

    public void setTenantId(Long tenantId) {
        this.tenantId = tenantId;
    }
}