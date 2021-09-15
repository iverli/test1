package com.iverli.test.pojo;

import com.iverli.test.ServerConstant;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;
import java.sql.Timestamp;



@Document(collection = ServerConstant.MONGO_COLLECTION_USER_PO)
public class UserList implements Serializable {
    @Id
    private String id;
    private int userId;
    private String loginName;
    private String userNameEng;
    private String userNameChi;
    private String status;
    private String userPhone;
    private String userAddress;
    private String userSex;
    private String createBy;
    private Timestamp createDtm;
    private String lastUpdateBy;
    private Timestamp lastUpdateDtm;

    public UserList(){

    }

    public UserList(String id, int userId, String loginName, String userNameEng, String userNameChi, String status, String userPhone, String userAddress, String userSex, String createBy, Timestamp createDtm, String lastUpdateBy, Timestamp lastUpdateDtm) {
        this.id = id;
        this.userId = userId;
        this.loginName = loginName;
        this.userNameEng = userNameEng;
        this.userNameChi = userNameChi;
        this.status = status;
        this.userPhone = userPhone;
        this.userAddress = userAddress;
        this.userSex = userSex;
        this.createBy = createBy;
        this.createDtm = createDtm;
        this.lastUpdateBy = lastUpdateBy;
        this.lastUpdateDtm = lastUpdateDtm;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public String getUserNameEng() {
        return userNameEng;
    }

    public void setUserNameEng(String userNameEng) {
        this.userNameEng = userNameEng;
    }

    public String getUserNameChi() {
        return userNameChi;
    }

    public void setUserNameChi(String userNameChi) {
        this.userNameChi = userNameChi;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }

    public String getUserAddress() {
        return userAddress;
    }

    public void setUserAddress(String userAddress) {
        this.userAddress = userAddress;
    }

    public String getUserSex() {
        return userSex;
    }

    public void setUserSex(String userSex) {
        this.userSex = userSex;
    }

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    public Timestamp getCreateDtm() {
        return createDtm;
    }

    public void setCreateDtm(Timestamp createDtm) {
        this.createDtm = createDtm;
    }

    public String getLastUpdateBy() {
        return lastUpdateBy;
    }

    public void setLastUpdateBy(String lastUpdateBy) {
        this.lastUpdateBy = lastUpdateBy;
    }

    public Timestamp getLastUpdateDtm() {
        return lastUpdateDtm;
    }

    public void setLastUpdateDtm(Timestamp lastUpdateDtm) {
        this.lastUpdateDtm = lastUpdateDtm;
    }
}
