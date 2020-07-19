package ink.bignose.catmall.member.feign;

import ink.bignose.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @AUTHOR: Ailenk
 * @DATETIME: 2019/4/30  12:36
 * DESCRIPTION:
 **/
@FeignClient("mall-coupon")
public interface CouponFeign {

    @GetMapping("/coupon/coupon/member/list")
    R memberList();
}
