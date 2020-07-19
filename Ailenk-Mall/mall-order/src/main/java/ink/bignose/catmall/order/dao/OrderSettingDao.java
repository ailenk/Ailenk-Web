package ink.bignose.catmall.order.dao;

import ink.bignose.catmall.order.entity.OrderSettingEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单配置信息
 * 
 * @author Ailenk
 * @websit https://www.bignose.ink
 * @date 2019-04-30 09:50:57
 */
@Mapper
public interface OrderSettingDao extends BaseMapper<OrderSettingEntity> {
	
}
