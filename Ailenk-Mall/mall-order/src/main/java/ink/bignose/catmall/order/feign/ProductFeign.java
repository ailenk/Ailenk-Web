package ink.bignose.catmall.order.feign;

import ink.bignose.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @AUTHOR: Ailenk
 * @DATETIME: 2019/5/24  18:02
 * DESCRIPTION:
 **/
@FeignClient("mall-product")
public interface ProductFeign {
    @GetMapping("/product/spuinfo/skuId/{id}")
    R getSpuInfoBySkuId(@PathVariable("id") Long skuId);
}
