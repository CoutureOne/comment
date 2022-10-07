package com.couture.dto;

import lombok.Data;

/**
 * @author Couture
 * @data: 2022/10/6
 * @description:
 */
@Data
public class LoginFormDTO {
    private String phone;
    private String code;
    private String password;
}
