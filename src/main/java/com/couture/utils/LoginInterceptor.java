package com.couture.utils;

import com.couture.dto.UserDTO;
import com.couture.entity.User;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * @author Couture
 * @data: 2022/10/7
 * @description:
 */
public class LoginInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        // 获取session
        HttpSession session = request.getSession();
        // 获取session中的用户
        Object user = session.getAttribute("user");
        // 用户是否存在
        if (user == null) {
            // 不存在拦截
            response.setStatus(401);
            return false;
        }
        // 存在，保存用户信息到ThreadLocal
        UserHolder.saveUser((User) user);
        // 放行
        return HandlerInterceptor.super.preHandle(request, response, handler);
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        // 移除用户
        UserHolder.removeUser();
    }
}
