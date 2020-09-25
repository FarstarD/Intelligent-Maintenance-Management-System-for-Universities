package com.chong.dao;

import com.chong.pojo.BaoBiao;
import com.chong.pojo.Books;
import org.apache.ibatis.annotations.Param;

import java.util.Date;
import java.util.List;
import java.util.Map;

public interface BookMapper {

    //查询所有表单信息
    List<Books> queryTotalBooks();
    //根据提交人查询表单信息
    List<Books> queryByInputName(@Param("startNum")int startNum,@Param("inputName")String inputName);
    List<Books> queryByInputName2(@Param("inputName")String inputName);
    //根据BookID查询表单信息
    List<Books> queryByBookId(int bookID);
    //根据BookID修改表单信息
    int updateByBookId(@Param("bookID")int bookID,@Param("inputName")String inputName,@Param("phone")String phone,@Param("maintainThing")String maintainThing,@Param("finishName")String finishName,@Param("sayProblem")String sayProblem,@Param("maintainNum")int maintainNum,@Param("bookAddress")String bookAddress,@Param("bookState")String bookState,@Param("end")String end);
    //根据BookID删除表单信息
    int deleteByBookId(int bookID);

    //上传维修表单
    int inputBooks(Books books);

    //根据表单状态查询信息
    List<Books> queryDeal(@Param("bookState")String bookState);

    //修改表单状态 例如:未处理--->正在处理
    int updateState(@Param("bookID")int bookID,@Param("bookState")String bookState);

    //点击完成,修改数据
    int inputNameAndState(@Param("bookID") String bookID, @Param("bookState")String bookState, @Param("finishName")String finishName, @Param("finishTime") Date finishTime, @Param("end")String end);

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
