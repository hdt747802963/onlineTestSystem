package com.olts.pojo;

/**
 * Title Student
 * 学生实体类
 *
 * @author 黄德涛
 *
 */

public class Student {
    private int studentId;  //学生账号
    private String password; //学生密码
    private String studentName; //学生姓名
    private int gender; //学生性别；0：女，1：男
    private String birthday;
    private String phone;
    private ClassInfo classInfo;    //学生班级
    private String school;  //学校

    //无参构造
    public Student(){}

    //构造参数账号密码
    public Student(int studentId, String password) {
        this.studentId = studentId;
        this.password = password;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int isGender() {
        return gender;
    }

    public void setGender(int gender) {
        this.gender = gender;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public ClassInfo getClassInfo() {
        return classInfo;
    }

    public void setClassInfo(ClassInfo classInfo) {
        this.classInfo = classInfo;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", password='" + password + '\'' +
                ", studentName='" + studentName + '\'' +
                ", gender=" + gender +
                ", birthday='" + birthday + '\'' +
                ", phone='" + phone + '\'' +
                ", classInfo=" + classInfo +
                ", school='" + school + '\'' +
                '}';
    }
}
