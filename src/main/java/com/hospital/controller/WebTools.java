package com.hospital.controller;

import com.hospital.entity.User;

import javax.servlet.http.HttpSession;

/**
 * Created by morland on 2016/3/20.
 */
public class WebTools {

    /**
     * UpdateSession 用来更新session缓存
     * @param user 传入用户类
     * @param session 需要更新的session连接
     */
    static void UpdateSession(User user, HttpSession session)
    {
        session.setAttribute("username",user.getUsername());
        session.setAttribute("hospital",user.getHospital());
        session.setAttribute("name",user.getName());
        session.setAttribute("post",user.getPost());
    }
}
