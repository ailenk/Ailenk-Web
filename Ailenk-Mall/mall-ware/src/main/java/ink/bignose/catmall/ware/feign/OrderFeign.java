package ink.bignose.catmall.ware.feign;

import ink.bignose.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @AUTHOR: Ailenk
 * @DATETIME: 2019/5/27  09:33
 * DESCRIPTION:
 **/
@FeignClient("mall-order")
public interface OrderFeign {
    @GetMapping("/order/order/status/{orderSn}")
    R getOrderStatus(@PathVariable("orderSn") String orderSn);
}
