package com.chong.config;

import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LoginInterceptor implements HandlerInterceptor {
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {

        HttpSession session = request.getSession();

        if(session.getAttribute("userLoginInfo")!=null) {
            // 登录成功不拦截
            return true;
        }

            //放行 : 判断什么情况登录
         if (request.getRequestURI().contains("toLogin")){
            return true;
        }
        //说明我在提交登录
        if (request.getRequestURI().contains("login")){
            return true;
        }
        if (request.getRequestURI().contains("toRegist")){
            return true;
        }
        if (request.getRequestURI().contains("Regist")){
            return true;
        }
        if (request.getRequestURI().contains("notBugAgain")){
            return true;
        }
        if (request.getRequestURI().contains("notAgain")){
            return true;
        }

        //第一次登录，也是没有session的
        if (session.getAttribute("userLoginInfo")!=null){
            return true;
        }
        //=======================================

        /*if (request.getRequestURI().contains("toPhoneRegist")){
            return true;
        }*/


        //判断什么情况没有登录
        request.getRequestDispatcher("/WEB-INF/jsp/login.jsp").forward(request,response);
        return false;

    }
}
