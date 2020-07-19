package ink.bignose.catmall.order.feign;

import ink.bignose.catmall.order.vo.WareSkuLockVO;
import ink.bignose.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * @AUTHOR: Ailenk
 * @DATETIME: 2019/5/23  19:10
 * DESCRIPTION:
 **/
@FeignClient("mall-ware")
public interface WareFeign {

    @PostMapping("/ware/waresku/hasstock")
    R getSkusHasStock(@RequestBody List<Long> skuIds);

    @GetMapping("/ware/wareinfo/fare")
    R getFare(@RequestParam("addrId") Long addrId);

    @PostMapping("/ware/waresku/lock/order")
    R lockOrder(@RequestBody WareSkuLockVO vo);

}
