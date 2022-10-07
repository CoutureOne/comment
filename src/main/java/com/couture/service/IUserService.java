package com.couture.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.couture.dto.LoginFormDTO;
import com.couture.dto.Result;
import com.couture.entity.User;

import javax.servlet.http.HttpSession;

/**
 * @author Couture
 * @data: 2022/10/6
 * @description: 服务类
 */
public interface IUserService extends IService<User> {

    Result sendCode(String phone, HttpSession session);

    Result login(LoginFormDTO loginForm, HttpSession session);
}
