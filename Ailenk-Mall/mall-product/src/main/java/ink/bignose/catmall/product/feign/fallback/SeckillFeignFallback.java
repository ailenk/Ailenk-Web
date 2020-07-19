package ink.bignose.catmall.product.feign.fallback;

import ink.bignose.catmall.product.feign.SeckillFeign;
import ink.bignose.common.utils.R;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**
 * @AUTHOR: Ailenk
 * @DATETIME: 2019/5/30  16:59
 * DESCRIPTION:
 **/
@Component
@Slf4j
public class SeckillFeignFallback implements SeckillFeign {
    @Override
    public R getSkuSeckillInfo(Long skuId) {
        log.info("熔断方法调用...product.feign.SeckillFeign");
        return null;
    }
}
