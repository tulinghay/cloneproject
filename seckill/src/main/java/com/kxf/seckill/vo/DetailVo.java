package com.kxf.seckill.vo;

import com.kxf.seckill.pojo.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 详情返回对象
 *
 * @author Kxf
 * @create 2021/11/26,0026
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class DetailVo {

    private User user;
    private GoodsVo goodsVo;
    private int secKillStatus;
    private int remainSeconds;
}
