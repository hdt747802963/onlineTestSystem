package com.olts.pojo;

/**
 * Title Grade
 * 成绩表实体类
 *
 * @author 黄德涛
 *
 */

public class Grade {
    private int gradeId;    //成绩id
    private Student student;    //对应的学生
    private Exam exam;  //对应的考试
    private int objectScore;    //主观题得分
    private int subjectScore;   //客观题得分
    private int grade;  //总分

    public Grade(){}

    public Grade(int gradeId, Student student, Exam exam, int objectScore, int subjectScore, int grade) {
        this.gradeId = gradeId;
        this.student = student;
        this.exam = exam;
        this.objectScore = objectScore;
        this.subjectScore = subjectScore;
        this.grade = grade;
    }

    public int getGradeId() {
        return gradeId;
    }

    public void setGradeId(int gradeId) {
        this.gradeId = gradeId;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Exam getExam() {
        return exam;
    }

    public void setExam(Exam exam) {
        this.exam = exam;
    }

    public int getObjectScore() {
        return objectScore;
    }

    public void setObjectScore(int objectScore) {
        this.objectScore = objectScore;
    }

    public int getSubjectScore() {
        return subjectScore;
    }

    public void setSubjectScore(int subjectScore) {
        this.subjectScore = subjectScore;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Grade{" +
                "gradeId=" + gradeId +
                ", student=" + student +
                ", exam=" + exam +
                ", objectScore=" + objectScore +
                ", subjectScore=" + subjectScore +
                ", grade=" + grade +
                '}';
    }
}
