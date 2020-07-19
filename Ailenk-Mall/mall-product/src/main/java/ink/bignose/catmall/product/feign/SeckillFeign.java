package ink.bignose.catmall.product.feign;

import ink.bignose.catmall.product.feign.fallback.SeckillFeignFallback;
import ink.bignose.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @AUTHOR: Ailenk
 * @DATETIME: 2019/5/29  19:38
 * DESCRIPTION:
 **/
@FeignClient(value = "mall-seckill", fallback = SeckillFeignFallback.class)
public interface SeckillFeign {
    @GetMapping("/sku/seckill/{skuId}")
    R getSkuSeckillInfo(@PathVariable("skuId") Long skuId);
}
