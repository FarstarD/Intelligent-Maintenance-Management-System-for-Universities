package com.chong.service;

import com.chong.dao.UserMapper;
import com.chong.pojo.Users;

import java.util.List;

public class UserServiceImpl implements UserService{
    //Service层调 Dao层
    private UserMapper userMapper;

    public void setUserMapper(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    //根据账号查找用户信息
    public List<Users> queryUserByLogin(String userLogin,String userJob) {
        return userMapper.queryUserByLogin(userLogin,userJob);
    }

    public Users queryUserByName(String userName) {
        return userMapper.queryUserByName(userName);
    }

    //注册账号
    public int addUser(Users users) {
        return userMapper.addUser(users);
    }

    //登录账号
    public Users  userLogin(String userName, String userLogin, String userPwd) {

        return userMapper.userLogin(userName,userLogin,userPwd);
    }

    //修改密码
    public int updatePwd(String userLogin,String newPwd) {
        return userMapper.updatePwd(userLogin,newPwd);
    }

    //查询所有用户信息
    public List<Users> queryAllUser() {
        return userMapper.queryAllUser();
    }

    //根据账号修改用户信息
    public int syUpdateUser(String userLogin, String userPwd, String userSex, String userName, String userJob, String userPhone) {
        return userMapper.syUpdateUser(userLogin,userPwd,userSex,userName,userJob,userPhone);
    }

    //根据账号删除用户信息
    public int deleteUserByLogin(int userID) {
        return userMapper.deleteUserByLogin(userID);
    }

    public int usersPage(int page) {
        return userMapper.usersPage(page);
    }
}
