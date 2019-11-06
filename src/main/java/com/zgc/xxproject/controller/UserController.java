package com.zgc.xxproject.controller;

import com.zgc.xxproject.mapper.UserMapper;
import com.zgc.xxproject.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.sql.DataSource;
import java.util.List;

@Controller

public class UserController {

    @Autowired
    private UserMapper userMapper;
    @Autowired
    private DataSource dataSource;
    @RequestMapping("/queryUserList")
    @ResponseBody
    public List<User> queryUserList(){
        List<User> users = userMapper.queryUserList();
        return users;
    }
}
