package com.couture.utils;

import lombok.Data;

import java.time.LocalDateTime;

/**
 * @author Couture
 * @data: 2022/10/6
 * @description: Mapper 接口
 */

@Data
public class RedisData {
    private LocalDateTime expireTime;
    private Object data;
}
