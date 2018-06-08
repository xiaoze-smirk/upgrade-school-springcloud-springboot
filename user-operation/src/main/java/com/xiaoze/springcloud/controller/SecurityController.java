package com.xiaoze.springcloud.controller;

import com.xiaoze.springcloud.entity.User;
import com.xiaoze.springcloud.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * SecurityController
 *
 * @author xiaoze
 * @date 2018/6/3
 *
 */

@RestController
public class SecurityController {

    @Autowired
    private UserService userService ;

    @GetMapping("/getOneUser/{userNo}")
    public User getOneUser(@PathVariable("userNo") String userNo){
        return userService.get(userNo);
    }

}