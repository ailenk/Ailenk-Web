package ink.bignose.catmall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import ink.bignose.common.utils.PageUtils;
import ink.bignose.catmall.order.entity.OrderSettingEntity;

import java.util.Map;

/**
 * 订单配置信息
 *
 * @author Ailenk
 * @websit https://www.bignose.ink
 * @date 2019-04-30 09:50:57
 */
public interface OrderSettingService extends IService<OrderSettingEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

