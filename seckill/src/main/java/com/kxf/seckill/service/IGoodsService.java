package com.kxf.seckill.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.kxf.seckill.pojo.Goods;
import com.kxf.seckill.vo.GoodsVo;

import java.util.List;

/**
 * <p>
 * 服务类
 * </p>
 *
 * @author kxf
 * @since 2021-11-17
 */
public interface IGoodsService extends IService<Goods> {

    /**
     * 获取商品列表
     *
     * @return
     */
    List<GoodsVo> findGoodsVo();

    /**
     * 获取商品详情
     *
     * @param goodsId
     * @return
     */
    GoodsVo findGoodsVoByGoodsId(Long goodsId);
}
