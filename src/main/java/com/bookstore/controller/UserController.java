package com.bookstore.controller;

import com.bookstore.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * 类 名 称：UserController
 * 类 描 述：用户操作相关的Controller
 * 创建时间：2019/9/10 10:29
 * 创建人：Mical
 */
@Controller
public class UserController {

    @Autowired
    private UserService userService;


}
