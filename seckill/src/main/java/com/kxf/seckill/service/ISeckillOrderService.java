package com.kxf.seckill.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.kxf.seckill.pojo.SeckillOrder;
import com.kxf.seckill.pojo.User;

/**
 * <p>
 * 服务类
 * </p>
 *
 * @author kxf
 * @since 2021-11-17
 */
public interface ISeckillOrderService extends IService<SeckillOrder> {

    /**
     * 获取秒杀结果
     *
     * @param user
     * @param goodsId
     * @return orderId：成功，-1：秒杀失败，0：排队中
     */
    Long getResult(User user, Long goodsId);
}
