package ink.bignose.catmall.seckill.feign;

import ink.bignose.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @AUTHOR: Ailenk
 * @DATETIME: 2019/5/29  17:01
 * DESCRIPTION:
 **/
@FeignClient("mall-product")
public interface ProductFeign {

    @RequestMapping("/product/skuinfo/info/{skuId}")
    R getSkuInfo(@PathVariable("skuId") Long skuId);

}
