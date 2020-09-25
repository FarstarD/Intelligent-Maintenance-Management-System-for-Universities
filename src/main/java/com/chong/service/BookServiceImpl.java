package com.chong.service;

import com.chong.dao.BookMapper;
import com.chong.pojo.BaoBiao;
import com.chong.pojo.Books;
import com.chong.pojo.Limit;
import org.apache.ibatis.annotations.Param;

import java.util.Date;
import java.util.HashMap;
import java.util.List;

public class BookServiceImpl implements BookService {
       //Service层调 Dao层
    private BookMapper bookMapper;

    public void setBookMapper(BookMapper bookMapper) {
        this.bookMapper = bookMapper;
    }

    //查询所有表单信息
    public List<Books> queryTotalBooks() {
        return bookMapper.queryTotalBooks();
    }

    public List<Books> queryByInputName(int startNum,String inputName) {
        return bookMapper.queryByInputName(startNum, inputName);
    }

    public List<Books> queryByInputName2(String inputName) {
        return bookMapper.queryByInputName2(inputName);
    }

    public List<Books> queryByBookId(int bookID) {
        return bookMapper.queryByBookId(bookID);
    }

    public int updateByBookId(int bookID,String inputName,String phone,String maintainThing,String finishName,String sayProblem,int maintainNum,String bookAddress,String bookState,String end) {
        return bookMapper.updateByBookId(bookID, inputName, phone, maintainThing, finishName, sayProblem, maintainNum, bookAddress, bookState, end);
    }

    public int deleteByBookId(int bookID) {
        return bookMapper.deleteByBookId(bookID);
    }

    //上传维修表单
    public int inputBooks(Books books) {
        return bookMapper.inputBooks(books);
    }

    //查询未处理的表单
    public List<Books> queryNullDeal(String bookState) {
        bookState = "未处理";
        return bookMapper.queryDeal(bookState);
    }
    //查询正在处理的表单
    public List<Books> queryDealIng(String bookState) {
        bookState = "正在处理";
        return bookMapper.queryDeal(bookState);
    }
    //查询已完成的表单
    public List<Books> queryDealEnd(String bookState) {
        bookState = "已完成";
        return bookMapper.queryDeal(bookState);
    }

    //点击接单,修改表单状态 未处理--->正在处理
    public int updateState(int bookID,String bookState) {
        bookState = "正在处理";
        return bookMapper.updateState(bookID,bookState);
    }
    //点击弃单,修改表单状态
    public int updateStateSec(int bookID,String bookState) {
        bookState = "未处理";
        return bookMapper.updateState(bookID,bookState);
    }

    //点击完成,修改表单状态
    public int updateStateTre(int bookID,String bookState) {
        bookState = "已完成";
        return bookMapper.updateState(bookID,bookState);
    }

    public int inputNameAndState(String inputName, String bookState, String finishName, Date finishTime, String end) {
        return bookMapper.inputNameAndState(inputName,bookState,finishName,finishTime,end);
    }

    public List<Books> bookSelfe(String inputName) {
        return bookMapper.bookSelfe(inputName);
    }

    public List<BaoBiao> sumBooks(Date inputTime, Date finishTime) {
        return bookMapper.sumBooks(inputTime,finishTime);
    }

    public List<BaoBiao> selectSumBooks(String maintainThing) {
        return bookMapper.selectSumBooks(maintainThing);
    }

    public List<Books> queryTotalBooks2(int startNum) {

        return bookMapper.queryTotalBooks2(startNum);
    }
}
