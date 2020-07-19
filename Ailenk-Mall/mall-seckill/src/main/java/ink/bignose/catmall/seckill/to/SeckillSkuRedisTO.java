package ink.bignose.catmall.seckill.to;

import ink.bignose.catmall.seckill.vo.SkuInfoVO;
import lombok.Data;

import java.math.BigDecimal;

/**
 * @AUTHOR: Ailenk
 * @DATETIME: 2019/5/29  16:41
 * DESCRIPTION:
 **/
@Data
public class SeckillSkuRedisTO {

    private Long promotionId;
    /**
     * 活动场次id
     */
    private Long promotionSessionId;
    /**
     * 商品id
     */
    private Long skuId;
    /**
     * 秒杀价格
     */
    private BigDecimal seckillPrice;
    /**
     * 秒杀总量
     */
    private BigDecimal seckillCount;
    /**
     * 每人限购数量
     */
    private Integer seckillLimit;
    /**
     * 排序
     */
    private Integer seckillSort;

    private Long startTime;

    private Long endTime;

    // 秒杀随机码
    private String randomCode;

    private SkuInfoVO skuInfo;

}
