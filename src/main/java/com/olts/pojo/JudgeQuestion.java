package com.olts.pojo;

/**
 * Title JudgeQuestion
 * 判断题实体类
 *
 * @author 黄德涛
 *
 */

public class JudgeQuestion {
    private int judgeQuestionId;    //题目id
    private String questionTitle;   //题干
    private int score;  //题目分数
    private String rightAnswer; //正确答案
    private int difficulty;     //难度(1-5)

    public JudgeQuestion(){}

    public JudgeQuestion(int judgeQuestionId, String questionTitle, int score, String rightAnswer, int difficulty) {
        this.judgeQuestionId = judgeQuestionId;
        this.questionTitle = questionTitle;
        this.score = score;
        this.rightAnswer = rightAnswer;
        this.difficulty = difficulty;
    }

    public int getJudgeQuestionId() {
        return judgeQuestionId;
    }

    public void setJudgeQuestionId(int judgeQuestionId) {
        this.judgeQuestionId = judgeQuestionId;
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
        return "JudgeQuestion{" +
                "judgeQuestionId=" + judgeQuestionId +
                ", questionTitle='" + questionTitle + '\'' +
                ", score=" + score +
                ", rightAnswer='" + rightAnswer + '\'' +
                ", difficulty=" + difficulty +
                '}';
    }
}
