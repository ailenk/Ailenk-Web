package ink.bignose.catmall.seckill.feign;

import ink.bignose.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @AUTHOR: Ailenk
 * @DATETIME: 2019/5/29  00:17
 * DESCRIPTION:
 **/
@FeignClient("mall-coupon")
public interface CouponFeign {

    @GetMapping("/coupon/seckillsession/latest3DaySession")
    R getLatest3DaySession();

}
