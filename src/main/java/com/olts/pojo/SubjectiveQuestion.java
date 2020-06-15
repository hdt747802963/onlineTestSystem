package com.olts.pojo;

/**
 * Title SubjectiveQuestion
 * 客观题实体类
 *
 * @author 黄德涛
 *
 */

public class SubjectiveQuestion {
    private int subjectiveQuestionId;   //题目id
    private String questionTitle;   //题干
    private int score;  //题目分数
    private String rightAnswer; //正确答案
    private int difficulty;     //难度(1-5)

    public SubjectiveQuestion(){}

    public SubjectiveQuestion(int subjectiveQuestionId, String questionTitle, int score, String rightAnswer, int difficulty) {
        this.subjectiveQuestionId = subjectiveQuestionId;
        this.questionTitle = questionTitle;
        this.score = score;
        this.rightAnswer = rightAnswer;
        this.difficulty = difficulty;
    }

    public int getSubjectiveQuestionId() {
        return subjectiveQuestionId;
    }

    public void setSubjectiveQuestionId(int subjectiveQuestionId) {
        this.subjectiveQuestionId = subjectiveQuestionId;
    }

    public String getQuestionTitle() {
        return questionTitle;
    }

    public void setQuestionTitle(String questionTitle) {
        this.questionTitle = questionTitle;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public String getRightAnswer() {
        return rightAnswer;
    }

    public void setRightAnswer(String rightAnswer) {
        this.rightAnswer = rightAnswer;
    }

    public int getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(int difficulty) {
        this.difficulty = difficulty;
    }

    @Override
    public String toString() {
        return "SubjectiveQuestion{" +
                "subjectiveQuestionId=" + subjectiveQuestionId +
                ", questionTitle='" + questionTitle + '\'' +
                ", score=" + score +
                ", rightAnswer='" + rightAnswer + '\'' +
                ", difficulty=" + difficulty +
                '}';
    }
}
