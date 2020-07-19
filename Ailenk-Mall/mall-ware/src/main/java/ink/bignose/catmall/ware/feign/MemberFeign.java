package ink.bignose.catmall.ware.feign;

import ink.bignose.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @AUTHOR: Ailenk
 * @DATETIME: 2019/5/24  14:36
 * DESCRIPTION:
 **/
@FeignClient("mall-member")
public interface MemberFeign {

    @RequestMapping("/member/memberreceiveaddress/info/{id}")
    R addrInfo(@PathVariable("id") Long id);

}
