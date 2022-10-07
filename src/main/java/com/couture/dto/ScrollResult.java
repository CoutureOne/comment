package com.couture.dto;

import lombok.Data;

import java.util.List;

/**
 * @author Couture
 * @data: 2022/10/6
 * @description:
 */

@Data
public class ScrollResult {
    private List<?> List;
    private Long minTime;
    private Integer offset;
}
