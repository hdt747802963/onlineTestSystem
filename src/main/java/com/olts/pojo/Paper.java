package com.olts.pojo;

/**
 * Title Paper
 * 试卷实体类
 *
 * @author 黄德涛
 *
 */

public class Paper {
    private int paperId;
    private String paperName;
    private int createType; //组卷类型（0：自动组卷，1：手动组卷）

    public Paper(){}

    public Paper(int paperId, String paperName, int createType) {
        this.paperId = paperId;
        this.paperName = paperName;
        this.createType = createType;
    }

    public int getPaperId() {
        return paperId;
    }

    public void setPaperId(int paperId) {
        this.paperId = paperId;
    }

    public String getPaperName() {
        return paperName;
    }

    public void setPaperName(String paperName) {
        this.paperName = paperName;
    }

    public int isCreateType() {
        return createType;
    }

    public void setCreateType(int createType) {
        this.createType = createType;
    }

    @Override
    public String toString() {
        return "Paper{" +
                "paperId=" + paperId +
                ", paperName='" + paperName + '\'' +
                ", createType=" + createType +
                '}';
    }
}
