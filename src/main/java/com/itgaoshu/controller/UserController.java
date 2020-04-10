package com.itgaoshu.controller;

import com.itgaoshu.bean.User;
import com.itgaoshu.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


import java.util.List;

@Controller
public class UserController {
    //依赖注入
    @Autowired
    private UserService userService;

    @RequestMapping("/selectUserList")
    public String selectUserList(Model model){
        List<User> users=userService.selectUserList();
        //发送到页面
        model.addAttribute("users",users);
        return "list";
    }


}
