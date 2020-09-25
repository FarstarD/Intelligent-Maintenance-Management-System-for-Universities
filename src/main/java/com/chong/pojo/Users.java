package com.chong.pojo;

public class Users {
    private int userID;
    private String userName;
    private String userLogin;
    private String userPwd;
    private String userSex;
    private String userJob;
    private String userPhone;

    public Users() {
    }

    public Users(int userID, String userName, String userLogin, String userPwd, String userSex, String userJob, String userPhone) {
        this.userID = userID;
        this.userName = userName;
        this.userLogin = userLogin;
        this.userPwd = userPwd;
        this.userSex = userSex;
        this.userJob = userJob;
        this.userPhone = userPhone;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserLogin() {
        return userLogin;
    }

    public void setUserLogin(String userLogin) {
        this.userLogin = userLogin;
    }

    public String getUserPwd() {
        return userPwd;
    }

    public void setUserPwd(String userPwd) {
        this.userPwd = userPwd;
    }

    public String getUserSex() {
        return userSex;
    }

    public void setUserSex(String userSex) {
        this.userSex = userSex;
    }

    public String getUserJob() {
        return userJob;
    }

    public void setUserJob(String userJob) {
        this.userJob = userJob;
    }

    public String getUserPhone() {
        return userPhone;
    }

    @Override
    public String toString() {
        return "Users{" +
                "userID=" + userID +
                ", userName='" + userName + '\'' +
                ", userLogin='" + userLogin + '\'' +
                ", userPwd='" + userPwd + '\'' +
                ", userSex='" + userSex + '\'' +
                ", userJob='" + userJob + '\'' +
                ", userPhone='" + userPhone + '\'' +
                '}';
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }
}
