package ink.bignose.catmall.order.feign;

import ink.bignose.catmall.order.vo.OrderItemVO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

/**
 * @AUTHOR: Ailenk
 * @DATETIME: 2019/5/23  15:39
 * DESCRIPTION:
 **/
@FeignClient("mall-cart")
public interface CartFeign {

    @GetMapping("/currentUserCartItems")
    List<OrderItemVO> getCurrentUserCartItems();

}
