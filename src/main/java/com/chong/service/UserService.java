package com.chong.service;

import com.chong.pojo.Users;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserService {

    //根据账号查用户
    List<Users> queryUserByLogin(@Param("userLogin")String userLogin,@Param("userJob")String userJob);
    //根据姓名查找
    Users queryUserByName(String userName);

    //根据职务或则真实姓名或则账号查找用户

    //注册一个账号
    int addUser(Users users);

    //账号登录
    Users  userLogin(@Param("userName")String userName, @Param("userLogin")String userLogin, @Param("userPwd")String userPwd);

    //修改密码
    int updatePwd(@Param("userLogin") String userLogin,@Param("newPwd") String newPwd);

    //查询所有用户信息
    List<Users> queryAllUser();

    //根据职务或则真实姓名或则账号查找用户
//    Users selectUser(@Param("userName")String userName,@Param("userLogin")String userLogin,@Param("userJob")String userJob);

    //根据账号修改用户信息
    int syUpdateUser(@Param("userLogin")String userLogin,@Param("userPwd")String userPwd,@Param("userSex")String userSex,@Param("userName")String userName,@Param("userJob")String userJob,@Param("userPhone")String userPhone);

    //根据用户账号删除用户
    int deleteUserByLogin(int userID);

    //分页查询用户
    int usersPage(int page);
}
