package com.kxf.seckill.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.kxf.seckill.pojo.Goods;
import com.kxf.seckill.vo.GoodsVo;

import java.util.List;

/**
 * <p>
 * Mapper 接口
 * </p>
 *
 * @author kxf
 * @since 2021-11-17
 */
public interface GoodsMapper extends BaseMapper<Goods> {

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
