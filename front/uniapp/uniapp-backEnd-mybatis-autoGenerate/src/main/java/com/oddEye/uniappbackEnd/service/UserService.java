package com.oddEye.uniappbackEnd.service;

import com.oddEye.uniappbackEnd.entity.User;
import com.baomidou.mybatisplus.extension.service.IService;
import com.oddEye.uniappbackEnd.vo.Result;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author oddEye
 * @since 2022-04-09
 */
public interface UserService {

    Result getUserInfo();
}
