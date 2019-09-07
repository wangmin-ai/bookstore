package com.bookstore.pojo;

import java.io.Serializable;
import java.util.Date;

/**
 * 类 名 称：BookUser
 * 类 描 述：用户表实体类
 * 创建时间：2019/9/7 14:39
 * 创建人：Mical
 */
public class BookUser implements Serializable {
    private int userId;
    private String userName;
    private String password;
    private String telephone;
    private String picture;
    private Date createTime;

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}
