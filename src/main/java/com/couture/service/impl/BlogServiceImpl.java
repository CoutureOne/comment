package com.couture.service.impl;

import com.couture.entity.Blog;
import com.couture.mapper.BlogMapper;
import com.couture.service.IBlogService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * @author Couture
 * @data: 2022/10/6
 * @description: 服务实现类
 */

@Service
public class BlogServiceImpl extends ServiceImpl<BlogMapper, Blog> implements IBlogService {

}
