package com.chong.controller;

import com.chong.pojo.Users;
import com.chong.service.UserService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {
    //controller 调 service 层
    @Autowired
    @Qualifier("UserServiceImpl")
    private UserService userService;

    @RequestMapping("/toLogin")
    public String goLogin(){
        return "login";
    }
    //登录账号
    @RequestMapping("/login")
    public String userLogin(HttpSession session, String userName, String userLogin, String userPwd, Model model){
        //把信息存在Session中
        session.setAttribute("userLoginInfo",userLogin);
        Users users = userService.userLogin(userName, userLogin, userPwd);
        if (users == null){
            return "login";
        }else if (users.getUserJob().equals("系统管理员")){
//            System.out.println(users.getUserJob());
            model.addAttribute("userSession",session.getAttribute("userLoginInfo"));
            return "frame";
        }else if (users.getUserJob().equals("维修员")){
            return "frame2";
        }else {
            System.out.println(users.getUserJob());
            return "bbb";
        }
    }
    //注销
    @RequestMapping("/goOut")
    public String goOut(HttpSession session){
        session.removeAttribute("userLoginInfo");
        return "login";
    }

    //跳转注册页面
    @RequestMapping("/toRegist")
    public String toRegist(){
        return "regist";
    }
    //姓名不能重复
    @RequestMapping("/notAgain")
    @ResponseBody
    public String noAgain(String userName){
        String msg3 = "";
        try {
            Users users = userService.queryUserByName(userName);
            if (userName.equals(users.getUserName())){
                System.out.println("该姓名已经存在");
                msg3 = "该姓名已经存在";
                return msg3;
            }
        }catch (Exception e){
            System.out.println("无数据");
            msg3 = "ok";
            return  msg3;
        }
        return msg3;
    }
    //登录账号不能重复
    @RequestMapping("/notBugAgain")
    @ResponseBody
    public String noAgain2(String userLogin,String nullWork){
        String msg2 = "";
        try {
            List<Users> list = userService.queryUserByLogin(userLogin,nullWork);
            Users users = list.get(0);
            System.out.println(users.getUserLogin());
            System.out.println("==================================");
            if (userLogin.equals(users.getUserLogin())){
                System.out.println("该用户已经存在");
                msg2 = "该用户已经存在";
                return msg2;
            }
        }catch (Exception e){
            System.out.println("无数据");
            msg2 = "ok";
            System.out.println(msg2);
            return  msg2;
        }
        return msg2;
    }

    //完成注册
    @RequestMapping("/Regist")
    public String finshRegist(Users users){
        System.out.println(users);
        userService.addUser(users);
        return "finshRegist";
    }

    //修改密码(跳转修改密码页面)
    @RequestMapping("/toUpdatePwd")
    public String toUpdatePwd(HttpSession session,String nullWork,Model model){
        String userLoginInfo = (String) session.getAttribute("userLoginInfo");
        model.addAttribute("userLoginInfo",userLoginInfo);
        List<Users> list = userService.queryUserByLogin(userLoginInfo, nullWork);
        Users users = list.get(0);
        System.out.println(users+"+wwwwwwwwwwwwwwwwww");
        String userJob = users.getUserJob();
        System.out.println(userJob+"qqqqqqqqqqqqqqqqqqqqq");
        if (userJob.equals("系统管理员")){
            return "UpdatePwd";
        }else if (userJob.equals("维修员")){
            return "UpdatePwd2";
        }else{
            return "UpdatePwd1";
        }
    }

    //修改完成后(跳转登录页面)
    @RequestMapping("/UpdateNew")
    @ResponseBody
    public String UpdateNew(String userLogin,String oldPwd,String nullWork){
        List<Users> list = userService.queryUserByLogin(userLogin,nullWork);
        Users users = list.get(0);
        System.out.println(users.getUserPwd());
        System.out.println(oldPwd+"----------------");
        System.out.println(oldPwd.equals(users.getUserPwd()));
        String msg = "";
        if (oldPwd != null){
            if (oldPwd.equals(users.getUserPwd())){
                msg = "ok";
            }else {
                msg = "请输入正确的原密码";
            }
            System.out.println(msg);
        }
        return msg;
    }

    //密码修改
    @RequestMapping("/xiuGaiPwd")
    public String xiuGaiPwd(String userLogin,String userPwd,String newPwd,String newPwd1){
        System.out.println(userPwd+"  nnnnnnnnnnnn");
        System.out.println(newPwd+"  nnnnnnnnnnnn");
        System.out.println(newPwd+"  nnnnnnnnnnnn");

        if (newPwd.equals(newPwd1)){
            int i = userService.updatePwd(userLogin,newPwd);
            System.out.println(userLogin);
            System.out.println(userPwd);
            if (i > 0) {
                System.out.println("修改成功");
            }
            return "redirect:/user/goOut";
        } else {
         return "redirect:/user/toUpdatePwd";
        }
    }

    //查询全部用户功能
    @RequestMapping("/queryAllUser")
    public String queryAllUser(Model model){
        List<Users> user = userService.queryAllUser();
        for (Users users : user) {
            System.out.println(users);
        }
        model.addAttribute("list",user);

        return "baseAllUser";
    }
    //跳转管理员修改页面
    @RequestMapping("/toSyUpdateUser")
    public String toSyUpdateUser( Model model,String userLogin){
        System.out.println("管理员跳转页面传的userLogin"+userLogin);
        model.addAttribute("userLogin",userLogin);
        return "syUpdateU";
    }

    //管理员修改用户信息
    @RequestMapping("/syUpdateUser")
    public String syUpdateUser(@Param("userLogin")String userLogin, @Param("userPwd")String userPwd, @Param("userSex")String userSex, @Param("userName")String userName, @Param("userJob")String userJob, @Param("userPhone")String userPhone){
        int i = userService.syUpdateUser( userLogin, userPwd, userSex, userName,userJob, userPhone);
        if (i>0){
            System.out.println("修改成功");
        }
        return "redirect:/user/queryAllUser";
    }

    //新增用户
    @RequestMapping("/newUser")
    public String inputUser(){
        return "inputUser";
    }

    //根据账号查找用户
    @RequestMapping("/selectUser")
    public String selectUser(String userLogin,Model model,String userJob){

        List<Users> list = userService.queryUserByLogin(userLogin,userJob);
        if(list==null || list.size()==0){
            list = userService.queryAllUser();
            model.addAttribute("error","未找到");
        }
        model.addAttribute("list",list);
        return "baseAllUser";
    }

    //根据用户账号删除用户
    @RequestMapping("/deleteUser")
    public String deleteUserByLogin(int userID){
        int i = userService.deleteUserByLogin(userID);
        if (i>0){
            System.out.println("删除:"+userID);
        }
        return "redirect:/user/queryAllUser";
    }

    //用户分页
    @RequestMapping("/PageUser")
    public String PageUser(Model model){
        List<Users> list = userService.queryAllUser();
        int firstPage = 1;
        model.addAttribute("nowPage",firstPage);
        int totalPage = list.size();
        return "baseAllBook";
    }

    //------------------------------------------------
    //手机登录页面
    @RequestMapping("/phoneLogin")
    public String phoneLogin(HttpSession session, String userName, String userLogin, String userPwd, Model model){
        //把信息存在Session中
        session.setAttribute("userLoginInfo",userLogin);
        Users users = userService.userLogin(userName, userLogin, userPwd);
        if (users.getUserJob().equals("老师") | users.getUserLogin().equals("学生")){
            model.addAttribute("userSession",session.getAttribute("userLoginInfo"));
            return "../../WEB-INF/jsp3/loginSuccess";
        }else {
            return "../../WEB-INF/jsp3/index2";
        }
    }

    //跳转注册页面
    @RequestMapping("/toPhoneRegist")
    public String toPhoneRegist(){
        return "../../WEB-INF/jsp3/注册";
    }

}
