package com.couture.service.impl;

import com.couture.entity.UserInfo;
import com.couture.mapper.UserInfoMapper;
import com.couture.service.IUserInfoService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * @author Couture
 * @data: 2022/10/6
 * @description: 服务实现类
 */
@Service
public class UserInfoServiceImpl extends ServiceImpl<UserInfoMapper, UserInfo> implements IUserInfoService {

}
