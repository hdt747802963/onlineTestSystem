package com.olts.pojo;

/**
 * Title Solution
 * 学生答案表实体类
 *
 * @author 黄德涛
 *
 */

public class Solution {
    private int solutionId;
    private Student student;
    private Exam exam;
    private Paper paper;
    private int questionCat; //题目类型（0：选择，1：判断，2：客观）
    private ChoiceQuestion choiceQuestion;  //选择题题目
    private JudgeQuestion judgeQuestion;    //判断题题目
    private SubjectiveQuestion subjectiveQuestion;  //客观题题目
    private int sequenceNumber; //该题目在试卷中的序号
    private String studentAnswer;    //学生该题目的答案
    private int correctState;   //批改状态（0：未批改，1：已批改）

    public Solution(){}

    //含有选择题的构造函数
    public Solution(int solutionId, Student student, Exam exam, Paper paper, int questionCat, ChoiceQuestion choiceQuestion, int sequenceNumber, String studentAnswer, int correctState) {
        this.solutionId = solutionId;
        this.student = student;
        this.exam = exam;
        this.paper = paper;
        this.questionCat = questionCat;
        this.choiceQuestion = choiceQuestion;
        this.sequenceNumber = sequenceNumber;
        this.studentAnswer = studentAnswer;
        this.correctState = correctState;
    }

    //含有判断题的构造函数
    public Solution(int solutionId, Student student, Exam exam, Paper paper, int questionCat, JudgeQuestion judgeQuestion, int sequenceNumber, String studentAnswer, int correctState) {
        this.solutionId = solutionId;
        this.student = student;
        this.exam = exam;
        this.paper = paper;
        this.questionCat = questionCat;
        this.judgeQuestion = judgeQuestion;
        this.sequenceNumber = sequenceNumber;
        this.studentAnswer = studentAnswer;
        this.correctState = correctState;
    }

    //含有主观题的构造函数

    public Solution(int solutionId, Student student, Exam exam, Paper paper, int questionCat, SubjectiveQuestion subjectiveQuestion, int sequenceNumber, String studentAnswer, int correctState) {
        this.solutionId = solutionId;
        this.student = student;
        this.exam = exam;
        this.paper = paper;
        this.questionCat = questionCat;
        this.subjectiveQuestion = subjectiveQuestion;
        this.sequenceNumber = sequenceNumber;
        this.studentAnswer = studentAnswer;
        this.correctState = correctState;
    }

    public int getSolutionId() {
        return solutionId;
    }

    public void setSolutionId(int solutionId) {
        this.solutionId = solutionId;
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

    public Paper getPaper() {
        return paper;
    }

    public void setPaper(Paper paper) {
        this.paper = paper;
    }

    public int getQuestionCat() {
        return questionCat;
    }

    public void setQuestionCat(int questionCat) {
        this.questionCat = questionCat;
    }

    public ChoiceQuestion getChoiceQuestion() {
        return choiceQuestion;
    }

    public void setChoiceQuestion(ChoiceQuestion choiceQuestion) {
        this.choiceQuestion = choiceQuestion;
    }

    public JudgeQuestion getJudgeQuestion() {
        return judgeQuestion;
    }

    public void setJudgeQuestion(JudgeQuestion judgeQuestion) {
        this.judgeQuestion = judgeQuestion;
    }

    public SubjectiveQuestion getSubjectiveQuestion() {
        return subjectiveQuestion;
    }

    public void setSubjectiveQuestion(SubjectiveQuestion subjectiveQuestion) {
        this.subjectiveQuestion = subjectiveQuestion;
    }

    public int getSequenceNumber() {
        return sequenceNumber;
    }

    public void setSequenceNumber(int sequenceNumber) {
        this.sequenceNumber = sequenceNumber;
    }

    public String getStudentAnser() {
        return studentAnswer;
    }

    public void setStudentAnser(String studentAnser) {
        this.studentAnswer = studentAnswer;
    }

    public int getCorrectState() {
        return correctState;
    }

    public void setCorrectState(int correctState) {
        this.correctState = correctState;
    }

    @Override
    public String toString() {
        return "Solution{" +
                "solutionId=" + solutionId +
                ", student=" + student +
                ", exam=" + exam +
                ", paper=" + paper +
                ", questionCat=" + questionCat +
                ", choiceQuestion=" + choiceQuestion +
                ", judgeQuestion=" + judgeQuestion +
                ", subjectiveQuestion=" + subjectiveQuestion +
                ", sequenceNumber=" + sequenceNumber +
                ", studentAnser='" + studentAnswer + '\'' +
                ", correctState=" + correctState +
                '}';
    }
}
