package com.kxf.seckill.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.kxf.seckill.pojo.Order;
import com.kxf.seckill.pojo.User;
import com.kxf.seckill.vo.GoodsVo;
import com.kxf.seckill.vo.OrderDetailVo;

/**
 * <p>
 * 服务类
 * </p>
 *
 * @author kxf
 * @since 2021-11-17
 */
public interface IOrderService extends IService<Order> {

    /**
     * 秒杀
     *
     * @param user
     * @param goods
     * @return
     */
    Order secKill(User user, GoodsVo goods);

    /**
     * 订单详情
     *
     * @param orderId
     * @return
     */
    OrderDetailVo detail(Long orderId);

    /**
     * 获取秒杀地址
     *
     * @param user
     * @param goodsId
     * @return
     */
    String createPath(User user, Long goodsId);

    /**
     * 校验秒杀地址
     *
     * @param user
     * @param goodsId
     * @param path
     * @return
     */
    boolean checkPath(User user, Long goodsId, String path);

    /**
     * 校验验证码
     *
     * @param user
     * @param goodsId
     * @param captcha
     * @return
     */
    boolean checkCaptcha(User user, Long goodsId, String captcha);
}
