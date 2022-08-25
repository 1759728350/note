package com.oddEye.uniappbackEnd.service.impl;

import com.oddEye.uniappbackEnd.entity.User;
import com.oddEye.uniappbackEnd.mapper.UserMapper;
import com.oddEye.uniappbackEnd.service.UserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.oddEye.uniappbackEnd.vo.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author oddEye
 * @since 2022-04-09
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
     private UserMapper userMapper;
    @Override
    public Result getUserInfo() {
        List<User> userList = userMapper.selectList(null);
        userList.forEach(System.out::println);
        return Result.success(userList);
    }
}
