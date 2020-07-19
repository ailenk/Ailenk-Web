package ink.bignose.catmall.coupon.dao;

import ink.bignose.catmall.coupon.entity.CouponHistoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券领取历史记录
 * 
 * @author Ailenk
 * @websit https://www.bignose.ink
 * @date 2019-04-30 09:39:47
 */
@Mapper
public interface CouponHistoryDao extends BaseMapper<CouponHistoryEntity> {
	
}
