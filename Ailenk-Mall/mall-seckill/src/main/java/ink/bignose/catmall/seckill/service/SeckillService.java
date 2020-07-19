package ink.bignose.catmall.seckill.service;

import ink.bignose.catmall.seckill.to.SeckillSkuRedisTO;

import java.util.List;

/**
 * @AUTHOR: Ailenk
 * @DATETIME: 2019/5/29  00:15
 * DESCRIPTION:
 **/
public interface SeckillService {

    void uploadSeckillSkuLatest3Days();

    List<SeckillSkuRedisTO> getCurrentSeckillSkus();

    SeckillSkuRedisTO getSkuSeckillInfo(Long skuId);

    String kill(String killId, String key, Integer num);
}
