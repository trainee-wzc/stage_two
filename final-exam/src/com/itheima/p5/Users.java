package com.itheima.p5;

public class Users {
    String logName;
    String passWord;

    public Users() {
    }

    public Users(String logName, String passWord) {
        this.logName = logName;
        this.passWord = passWord;
    }

    public String getLogName() {
        return logName;
    }

    public void setLogName(String logName) {
        this.logName = logName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }
}
