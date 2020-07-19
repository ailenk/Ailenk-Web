package ink.bignose.catmall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import ink.bignose.common.utils.PageUtils;
import ink.bignose.catmall.order.entity.OrderItemEntity;

import java.util.Map;

/**
 * 订单项信息
 *
 * @author Ailenk
 * @websit https://www.bignose.ink
 * @date 2019-04-30 09:50:58
 */
public interface OrderItemService extends IService<OrderItemEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

