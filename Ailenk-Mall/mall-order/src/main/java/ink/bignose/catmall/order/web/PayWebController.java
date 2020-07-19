package ink.bignose.catmall.order.web;

import com.alipay.api.AlipayApiException;
import ink.bignose.catmall.order.config.AlipayTemplate;
import ink.bignose.catmall.order.service.OrderService;
import ink.bignose.catmall.order.vo.PayVo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * @AUTHOR: Ailenk
 * @DATETIME: 2019/5/28  10:03
 * DESCRIPTION:
 **/
@Controller
public class PayWebController {

    @Resource
    private AlipayTemplate alipayTemplate;

    @Resource
    private OrderService orderService;

    @ResponseBody
    @GetMapping(value = "payOrder", produces = "text/html")
    public String payOrder(@RequestParam("orderSn") String orderSn) throws AlipayApiException {
        PayVo payVo = orderService.getOrderPay(orderSn);
        return alipayTemplate.pay(payVo);
    }

}
