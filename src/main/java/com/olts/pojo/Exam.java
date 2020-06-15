package com.olts.pojo;

/**
 * Title Exam
 * 考试实体类
 *
 * @author 黄德涛
 *
 */

public class Exam {
    private int examId; //考试ID
    private String examName; //考试名字
    private Paper paper;    //对应试卷
    private String beginTime;   //开始时间
    private String endTime; //结束时间
    private int examState;  //考试状态（0：未开考 1：正在进行 2：已结束）

    public Exam(){}

    public Exam(int examId, String examName, Paper paper, String beginTime, String endTime, int examState) {
        this.examId = examId;
        this.examName = examName;
        this.paper = paper;
        this.beginTime = beginTime;
        this.endTime = endTime;
        this.examState = examState;
    }

    public int getExamId() {
        return examId;
    }

    public void setExamId(int examId) {
        this.examId = examId;
    }

    public String getExamName() {
        return examName;
    }

    public void setExamName(String examName) {
        this.examName = examName;
    }

    public Paper getPaper() {
        return paper;
    }

    public void setPaper(Paper paper) {
        this.paper = paper;
    }

    public String getBeginTime() {
        return beginTime;
    }

    public void setBeginTime(String beginTime) {
        this.beginTime = beginTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public int getExamState() {
        return examState;
    }

    public void setExamState(int examState) {
        this.examState = examState;
    }

    @Override
    public String toString() {
        return "Exam{" +
                "examId=" + examId +
                ", examName='" + examName + '\'' +
                ", paper=" + paper +
                ", beginTime='" + beginTime + '\'' +
                ", endTime='" + endTime + '\'' +
                ", examState=" + examState +
                '}';
    }
}
