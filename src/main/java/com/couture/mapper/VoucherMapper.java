package com.couture.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.couture.entity.Voucher;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author Couture
 * @data: 2022/10/6
 * @description: Mapper 接口
 */

public interface VoucherMapper extends BaseMapper<Voucher> {

    List<Voucher> queryVoucherOfShop(@Param("shopId") Long shopId);
}
