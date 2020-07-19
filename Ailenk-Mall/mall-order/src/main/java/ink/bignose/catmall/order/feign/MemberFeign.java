package ink.bignose.catmall.order.feign;

import ink.bignose.catmall.order.vo.MemberAddressVO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

/**
 * @AUTHOR: Ailenk
 * @DATETIME: 2019/5/23  15:18
 * DESCRIPTION:
 **/
@FeignClient("mall-member")
public interface MemberFeign {

    @GetMapping("/member/memberreceiveaddress/{memberId}/addresses")
    List<MemberAddressVO> getAddresses(@PathVariable("memberId") Long memberId);

}
