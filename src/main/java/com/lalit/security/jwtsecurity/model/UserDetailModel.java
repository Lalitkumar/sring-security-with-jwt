package com.lalit.security.jwtsecurity.model;

public class UserDetailModel {

    private String userName;
    private String password;

    public UserDetailModel(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    public UserDetailModel() {
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
}
