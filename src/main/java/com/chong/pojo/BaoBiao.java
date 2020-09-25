package com.chong.pojo;

public class BaoBiao {
    private String maintainThing;
    private String main_num;
    private String inputTime;
    private String finishTime;

    @Override
    public String toString() {
        return "BaoBiao{" +
                "maintainThing='" + maintainThing + '\'' +
                ", main_num='" + main_num + '\'' +
                ", inputTime='" + inputTime + '\'' +
                ", finishTime='" + finishTime + '\'' +
                '}';
    }

    public String getMaintainThing() {
        return maintainThing;
    }

    public void setMaintainThing(String maintainThing) {
        this.maintainThing = maintainThing;
    }

    public String getMain_num() {
        return main_num;
    }

    public void setMain_num(String main_num) {
        this.main_num = main_num;
    }

    public String getInputTime() {
        return inputTime;
    }

    public void setInputTime(String inputTime) {
        this.inputTime = inputTime;
    }

    public String getFinishTime() {
        return finishTime;
    }

    public void setFinishTime(String finishTime) {
        this.finishTime = finishTime;
    }

    public BaoBiao(String maintainThing, String main_num, String inputTime, String finishTime) {
        this.maintainThing = maintainThing;
        this.main_num = main_num;
        this.inputTime = inputTime;
        this.finishTime = finishTime;
    }

    public BaoBiao() {
    }
}