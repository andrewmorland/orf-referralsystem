package com.hospital.controller;

import com.hospital.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

/**
 * Created by morland on 2016/3/18.
 */
@Controller
public class MainController {


    @Autowired@Qualifier("UserService")
    private UserService userService;
    @RequestMapping("/")
    public String index(Model model, HttpSession session)
    {

        if(session.getAttribute("username")!=null)
        {
            WebTools.UpdateSession(userService.getbyname(session.getAttribute("username").toString()),session);
            session.setAttribute("page","主页");
            return "index";
        }
        else return "login";
    }
}
