package com.zgc.xxproject;

import com.zgc.xxproject.mapper.UserMapper;
import com.zgc.xxproject.pojo.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class XxProjectApplicationTests {

    @Autowired
    private UserMapper userMapper;
    @Test
    void contextLoads() {
        List<User> users = userMapper.queryUserList();
        System.out.println("数据为："+users);
    }

}
