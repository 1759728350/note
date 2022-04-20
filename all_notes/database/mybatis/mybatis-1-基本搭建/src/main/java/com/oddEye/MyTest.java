package com.oddEye;

import com.oddEye.dao.UserMapper;
import com.oddEye.pojo.User;
import com.oddEye.util.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;


import java.util.List;

public class MyTest {

    @Test
    public void selectUser() {
        SqlSession session = MybatisUtils.getSession();
        //方法一:
        //List<User> users = session.selectList("com.kuang.mapper.UserMapper.selectUser");
        //方法二:
        UserMapper mapper = session.getMapper(UserMapper.class);
        List<User> users = mapper.selectUser();

        for (User user: users){
            System.out.println(user);
        }
        session.close();
    }
}