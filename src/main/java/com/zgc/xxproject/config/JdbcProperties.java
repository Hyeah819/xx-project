package com.zgc.xxproject.config;

import lombok.Data;

import java.util.List;

//@ConfigurationProperties(prefix = "spring.datasource")
//@EnableConfigurationProperties(JdbcProperties.class)配合使用
@Data
//如果用不了data注解，要下载插件
public class JdbcProperties {

    String driverClassName;

    String url;

    String username;

    String password;

    User user = new User();

    class User{
        String name;
        Integer age;
        List<String> language;
    }

}
