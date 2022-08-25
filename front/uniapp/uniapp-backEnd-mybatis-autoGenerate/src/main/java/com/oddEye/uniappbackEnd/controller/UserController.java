package com.oddEye.uniappbackEnd.controller;


import com.oddEye.uniappbackEnd.mapper.UserMapper;
import com.oddEye.uniappbackEnd.service.UserService;
import com.oddEye.uniappbackEnd.vo.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author oddEye
 * @since 2022-04-09
 */
@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/uniappbackEnd/user")
public class UserController {
    @Autowired
    private UserService userService;
    @RequestMapping("getUser")
    public Result getUserInfo(){

        return userService.getUserInfo();
    }
}

