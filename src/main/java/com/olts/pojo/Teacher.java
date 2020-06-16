package com.olts.pojo;

/**
 * Title Teacher
 * 老师实体类
 *
 * @author 黄德涛
 *
 */

public class Teacher {
    private int teacherId;
    private String password;
    private String teacherName;
    private int gender; //性别；0：女，1：男
    private String email;

    //无参构造
    public Teacher(){}

    //构造参数账号密码
    public Teacher(int teacherId, String password) {
        this.teacherId = teacherId;
        this.password = password;
    }

    public Teacher(int teacherId, String password, String teacherName, int gender, String email) {
        this.teacherId = teacherId;
        this.password = password;
        this.teacherName = teacherName;
        this.gender = gender;
        this.email = email;
    }

    public int getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(int teacherId) {
        this.teacherId = teacherId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public int isGender() {
        return gender;
    }

    public void setGender(int gender) {
        this.gender = gender;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "teacherId=" + teacherId +
                ", password='" + password + '\'' +
                ", teacherName='" + teacherName + '\'' +
                ", gender=" + gender +
                ", email='" + email + '\'' +
                '}';
    }
}
