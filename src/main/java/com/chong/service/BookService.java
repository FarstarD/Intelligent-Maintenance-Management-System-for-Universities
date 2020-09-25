package com.chong.service;

import com.chong.pojo.BaoBiao;
import com.chong.pojo.Books;
import org.apache.ibatis.annotations.Param;

import java.util.Date;
import java.util.List;

public interface BookService {

    //查询所有表单信息
    List<Books> queryTotalBooks();
    //根据提交人查询表单信息
    List<Books> queryByInputName(@Param("startNum")int startNum,@Param("inputName")String inputName);
    List<Books> queryByInputName2(String inputName);
    //根据BookID查询表单信息
    List<Books> queryByBookId(int bookID);
    //根据BookID修改表单信息
    int updateByBookId(@Param("bookID")int bookID,@Param("inputName")String inputName,@Param("phone")String phone,@Param("maintainThing")String maintainThing,@Param("finishName")String finishName,@Param("sayProblem")String sayProblem,@Param("maintainNum")int maintainNum,@Param("bookAddress")String bookAddress,@Param("bookState")String bookState,@Param("end")String end);
    //根据BookID删除表单信息
    int deleteByBookId(int bookID);

    //上传维修表单
    int inputBooks(Books books);

    //查询未处理的表单
    List<Books> queryNullDeal(@Param("bookState")String bookState);
    //查询正在处理的表单
    List<Books> queryDealIng(@Param("bookState")String bookState);
    //查询已完成的表单
    List<Books> queryDealEnd(@Param("bookState")String bookState);

    //点击接单,修改表单状态
    int updateState(@Param("bookID") int bookID, @Param("bookState")String bookState);
    //点击弃单,修改表单状态
    int updateStateSec(@Param("bookID") int bookID, @Param("bookState")String bookState);
    //点击完成,修改表单状态
    int updateStateTre(@Param("bookID")int bookID,@Param("bookState")String bookState);

    //点击完成,修改数据
    int inputNameAndState(@Param("inputName")String inputName, @Param("bookState")String bookState, @Param("finishName")String finishName, @Param("finishTime") Date finishTime, @Param("end")String end);

    //根据表单提交的姓名查找表单信息
    List<Books> bookSelfe(@Param("inputName")String inputName);

    //管理员报表汇总
    List<BaoBiao> sumBooks(@Param("inputTime") Date inputTime, @Param("finishTime") Date finishTime);

    //管理员报表汇总-查询
    List<BaoBiao> selectSumBooks(@Param("maintainThing")String maintainThing);

    //分页查询
    //查询所有表单信息
    List<Books> queryTotalBooks2(@Param("startNum")int startNum);
}
