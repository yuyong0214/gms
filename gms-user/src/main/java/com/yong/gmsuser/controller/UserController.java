package com.yong.gmsuser.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author: YUY
 * @date: 2019/5/26 16:39
 */
@Controller
public class UserController {
    @RequestMapping("/loginUI")
    public String loingUI(){
        return "/login";
    }
    @RequestMapping("login")
    public String login(@PathVariable("username") String userName,
                        @PathVariable("password") String password){
        return "/index";
    }
}
