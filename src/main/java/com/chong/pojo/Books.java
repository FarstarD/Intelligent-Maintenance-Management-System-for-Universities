package com.chong.pojo;

import java.util.Date;

public class Books {
    private int bookID;
    private String inputName;
    private String phone;
    private String maintainThing;
    private String finishName;
    private String sayProblem;
    private int maintainNum;
    private String bookAddress;
    private Date inputTime;
    private Date finishTime;
    private String bookState;
    private String end;

    public Books() {
    }

    public Books(int bookID, String inputName, String phone, String maintainThing, String finishName, String sayProblem, int maintainNum, String bookAddress, Date inputTime, Date finishTime, String bookState, String end) {
        this.bookID = bookID;
        this.inputName = inputName;
        this.phone = phone;
        this.maintainThing = maintainThing;
        this.finishName = finishName;
        this.sayProblem = sayProblem;
        this.maintainNum = maintainNum;
        this.bookAddress = bookAddress;
        this.inputTime = inputTime;
        this.finishTime = finishTime;
        this.bookState = bookState;
        this.end = end;
    }

    public int getBookID() {
        return bookID;
    }

    public void setBookID(int bookID) {
        this.bookID = bookID;
    }

    public String getInputName() {
        return inputName;
    }

    public void setInputName(String inputName) {
        this.inputName = inputName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getMaintainThing() {
        return maintainThing;
    }

    public void setMaintainThing(String maintainThing) {
        this.maintainThing = maintainThing;
    }

    public String getFinishName() {
        return finishName;
    }

    public void setFinishName(String finishName) {
        this.finishName = finishName;
    }

    public String getSayProblem() {
        return sayProblem;
    }

    public void setSayProblem(String sayProblem) {
        this.sayProblem = sayProblem;
    }

    public int getMaintainNum() {
        return maintainNum;
    }

    public void setMaintainNum(int maintainNum) {
        this.maintainNum = maintainNum;
    }

    public String getBookAddress() {
        return bookAddress;
    }

    public void setBookAddress(String bookAddress) {
        this.bookAddress = bookAddress;
    }

    public Date getInputTime() {
        return inputTime;
    }

    public void setInputTime(Date inputTime) {
        this.inputTime = inputTime;
    }

    public Date getFinishTime() {
        return finishTime;
    }

    public void setFinishTime(Date finishTime) {
        this.finishTime = finishTime;
    }

    public String getBookState() {
        return bookState;
    }

    public void setBookState(String bookState) {
        this.bookState = bookState;
    }

    public String getEnd() {
        return end;
    }

    public void setEnd(String end) {
        this.end = end;
    }

    @Override
    public String toString() {
        return "Books{" +
                "bookID=" + bookID +
                ", inputName='" + inputName + '\'' +
                ", phone='" + phone + '\'' +
                ", maintainThing='" + maintainThing + '\'' +
                ", finishName='" + finishName + '\'' +
                ", sayProblem='" + sayProblem + '\'' +
                ", maintainNum=" + maintainNum +
                ", bookAddress='" + bookAddress + '\'' +
                ", inputTime=" + inputTime +
                ", finishTime=" + finishTime +
                ", bookState='" + bookState + '\'' +
                ", end='" + end + '\'' +
                '}';
    }
}
