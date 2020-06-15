package com.olts.pojo;

/**
 * Title ChoiceQuestion
 * 选择题实体类
 *
 * @author 黄德涛
 *
 */

public class ChoiceQuestion {
    private int choiceQuestionId;   //题目id
    private String questionTitle;   //题干
    private int score;  //题目分数
    private String rightAnswer; //正确答案
    private String optionA;     //A选项描述
    private String optionB;     //B选项描述
    private String optionC;     //C选项描述
    private String optionD;     //D选项描述
    private int isMutiple;      //是否多选(0否1是)
    private int difficulty;     //难度(1-5)

    public ChoiceQuestion(){}

    public ChoiceQuestion(int choiceQuestionId, String questionTitle, int score, String rightAnswer, String optionA, String optionB, String optionC, String optionD, int isMutiple, int difficulty) {
        this.choiceQuestionId = choiceQuestionId;
        this.questionTitle = questionTitle;
        this.score = score;
        this.rightAnswer = rightAnswer;
        this.optionA = optionA;
        this.optionB = optionB;
        this.optionC = optionC;
        this.optionD = optionD;
        this.isMutiple = isMutiple;
        this.difficulty = difficulty;
    }

    public int getChoiceQuestionId() {
        return choiceQuestionId;
    }

    public void setChoiceQuestionId(int choiceQuestionId) {
        this.choiceQuestionId = choiceQuestionId;
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

    public String getOptionA() {
        return optionA;
    }

    public void setOptionA(String optionA) {
        this.optionA = optionA;
    }

    public String getOptionB() {
        return optionB;
    }

    public void setOptionB(String optionB) {
        this.optionB = optionB;
    }

    public String getOptionC() {
        return optionC;
    }

    public void setOptionC(String optionC) {
        this.optionC = optionC;
    }

    public String getOptionD() {
        return optionD;
    }

    public void setOptionD(String optionD) {
        this.optionD = optionD;
    }

    public int getIsMutiple() {
        return isMutiple;
    }

    public void setIsMutiple(int isMutiple) {
        this.isMutiple = isMutiple;
    }

    public int getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(int difficulty) {
        this.difficulty = difficulty;
    }

    @Override
    public String toString() {
        return "ChoiceQuestion{" +
                "choiceQuestionId=" + choiceQuestionId +
                ", questionTitle='" + questionTitle + '\'' +
                ", score=" + score +
                ", rightAnswer='" + rightAnswer + '\'' +
                ", optionA='" + optionA + '\'' +
                ", optionB='" + optionB + '\'' +
                ", optionC='" + optionC + '\'' +
                ", optionD='" + optionD + '\'' +
                ", isMutiple=" + isMutiple +
                ", difficulty=" + difficulty +
                '}';
    }
}
