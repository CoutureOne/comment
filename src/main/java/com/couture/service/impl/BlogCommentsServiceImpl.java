package com.couture.service.impl;

import com.couture.entity.BlogComments;
import com.couture.mapper.BlogCommentsMapper;
import com.couture.service.IBlogCommentsService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * @author Couture
 * @data: 2022/10/6
 * @description: 服务实现类
 */
@Service
public class BlogCommentsServiceImpl extends ServiceImpl<BlogCommentsMapper, BlogComments> implements IBlogCommentsService {

}
