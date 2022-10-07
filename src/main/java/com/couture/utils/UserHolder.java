package com.couture.utils;

import com.couture.dto.UserDTO;
import com.couture.entity.User;

/**
 * @author Couture
 * @data: 2022/10/6
 * @description: Mapper 接口
 */

public class UserHolder {
    private static final ThreadLocal<UserDTO> tl = new ThreadLocal<>();

    public static void saveUser(User user){
        tl.set(user);
    }

    public static UserDTO getUser(){
        return tl.get();
    }

    public static void removeUser(){
        tl.remove();
    }
}
