package com.olts.pojo;

/**
 * Title Admin
 * 管理员实体类
 *
 * @author 黄德涛
 *
 */

public class Admin {
    private int account; //用户名
    private String password;//密码
    private String name;    //姓名

    public Admin(){}

    public Admin(int account, String password) {
        this.account = account;
        this.password = password;
    }

    public Admin(int account, String password, String name) {
        this.account = account;
        this.password = password;
        this.name = name;
    }

    public int getAccount() {
        return account;
    }

    public void setAccount(int account) {
        this.account = account;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Admin{" +
                "account='" + account + '\'' +
                ", password='" + password + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
