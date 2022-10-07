package com.couture.config;


import com.couture.dto.Result;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Couture
 * @data: 2022/10/6
 * @description:
 */

@Slf4j
@RestController
public class WebExceptionAdvice {

    @ExceptionHandler(RuntimeException.class)
    public Result handleRunTimeException(RuntimeException e) {
        log.error(e.toString(), e);
        return Result.fail("服务器异常");
    }
}
