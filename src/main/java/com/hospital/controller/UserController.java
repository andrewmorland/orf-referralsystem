package com.hospital.controller;

import com.hospital.dao.IUserDao;
import com.hospital.entity.User;
import com.hospital.service.UserService;
import com.hospital.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

/**
 * Created by morland on 2016/3/19.
 */
@Controller
public class UserController {



    @Autowired
    private UserService userservice;

    @RequestMapping("/user/logout")
    public String logout(Model model, HttpSession session) {
        session.invalidate();
        return "redirect:/";
    }

    /**
     * 登录
     * @param user
     * @param model
     * @param session
     * @return
     */
    @RequestMapping("/user/login")
    public String login(User user, Model model, HttpSession session) {
        User result= userservice.login(user);
        if(result!=null) {
            WebTools.UpdateSession(result,session);
            return "redirect:/";
        }
        else return "fail";


    }


}
