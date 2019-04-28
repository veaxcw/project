package com.bilibili.main.model;

import org.springframework.stereotype.Component;

import java.util.Date;

@Component(value = "user")
public class User {
    private int userId;

    private String userRealName;

    private String userName;

    private String sex;

    private String password;

    private String userAddress;

    private String userPhone;

    private String userQQ;

    private String userEmail;

    private String userCollection;

    private String userBankCard;

    private String userStatus;

    private Date userLoginTime;

    private String userIp;

    private String userPaymentPassword;

    private Float userBalance;

    private String userIcon;

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserRealName() {
        return userRealName;
    }

    public void setUserRealName(String userRealName) {
        this.userRealName = userRealName == null ? null : userRealName.trim();
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getUserAddress() {
        return userAddress;
    }

    public void setUserAddress(String userAddress) {
        this.userAddress = userAddress == null ? null : userAddress.trim();
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone == null ? null : userPhone.trim();
    }

    public String getUserQQ() {
        return userQQ;
    }

    public void setUserQQ(String userQQ) {
        this.userQQ = userQQ == null ? null : userQQ.trim();
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail == null ? null : userEmail.trim();
    }

    public String getUserCollection() {
        return userCollection;
    }

    public void setUserCollection(String userCollection) {
        this.userCollection = userCollection == null ? null : userCollection.trim();
    }

    public String getUserBankCard() {
        return userBankCard;
    }

    public void setUserBankCard(String userBankCard) {
        this.userBankCard = userBankCard == null ? null : userBankCard.trim();
    }

    public String getUserStatus() {
        return userStatus;
    }

    public void setUserStatus(String userStatus) {
        this.userStatus = userStatus == null ? null : userStatus.trim();
    }

    public Date getUserLoginTime() {
        return userLoginTime;
    }

    public void setUserLoginTime(Date userLoginTime) {
        this.userLoginTime = userLoginTime;
    }

    public String getUserIp() {
        return userIp;
    }

    public void setUserIp(String userIp) {
        this.userIp = userIp == null ? null : userIp.trim();
    }

    public String getUserPaymentPassword() {
        return userPaymentPassword;
    }

    public void setUserPaymentPassword(String userPaymentPassword) {
        this.userPaymentPassword = userPaymentPassword == null ? null : userPaymentPassword.trim();
    }

    public Float getUserBalance() {
        return userBalance;
    }

    public void setUserBalance(Float userBalance) {
        this.userBalance = userBalance;
    }

    public String getUserIcon() {
        return userIcon;
    }

    public void setUserIcon(String userIcon) {
        this.userIcon = userIcon ;
    }

    public String toString(){
        return "userName:" + userName + "\n" +
                "password:" + password;
    }
}