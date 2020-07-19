package ink.bignose.catmall.member.feign;

import ink.bignose.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

/**
 * @AUTHOR: Ailenk
 * @DATETIME: 2019/5/28  11:09
 * DESCRIPTION:
 **/
@FeignClient("mall-order")
public interface OrderFeign {

    @RequestMapping("/order/order/listWithItems")
    R listWithItems(@RequestBody Map<String, Object> params);

}
