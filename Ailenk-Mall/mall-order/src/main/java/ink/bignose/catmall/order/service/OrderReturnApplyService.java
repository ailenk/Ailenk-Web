package ink.bignose.catmall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import ink.bignose.common.utils.PageUtils;
import ink.bignose.catmall.order.entity.OrderReturnApplyEntity;

import java.util.Map;

/**
 * 订单退货申请
 *
 * @author Ailenk
 * @websit https://www.bignose.ink
 * @date 2019-04-30 09:50:58
 */
public interface OrderReturnApplyService extends IService<OrderReturnApplyEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

