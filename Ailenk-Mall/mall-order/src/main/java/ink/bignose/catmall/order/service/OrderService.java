package ink.bignose.catmall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import ink.bignose.catmall.order.vo.*;
import ink.bignose.common.to.mq.SeckillOrderTO;
import ink.bignose.common.utils.PageUtils;
import ink.bignose.catmall.order.entity.OrderEntity;

import java.util.Map;
import java.util.concurrent.ExecutionException;

/**
 * 订单
 *
 * @author Ailenk
 * @websit https://www.bignose.ink
 * @date 2019-04-30 09:50:58
 */
public interface OrderService extends IService<OrderEntity> {

    PageUtils queryPage(Map<String, Object> params);

    OrderConfirmVO confirmOrder() throws ExecutionException, InterruptedException;

    SubmitOrderResponseVO submitOrder(OrderSubmitVO submitVO);

    OrderEntity getOrderByOrderSn(String orderSn);

    void closeOrder(OrderEntity entity);

    PayVo getOrderPay(String orderSn);

    PageUtils queryPageWithItems(Map<String, Object> params);

    String handlePayResult(PayAsyncVo vo);

    void createSeckillOrder(SeckillOrderTO seckillOrder);
}

