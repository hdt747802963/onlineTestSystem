package com.olts.pojo;

/**
 * Title User
 * 用户实体类
 *
 * @author 黄德涛
 *
 */

public class User {
    private int uid;    //用户账号
    private String upwd;    //用户密码

    //无参构造
    public User(){}

    public User(int uid, String upwd) {
        this.uid = uid;
        this.upwd = upwd;
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public String getUpwd() {
        return upwd;
    }

    public void setUpwd(String upwd) {
        this.upwd = upwd;
    }

    @Override
    public String toString() {
        return "User{" +
                "uid=" + uid +
                ", upwd='" + upwd + '\'' +
                '}';
    }
}
