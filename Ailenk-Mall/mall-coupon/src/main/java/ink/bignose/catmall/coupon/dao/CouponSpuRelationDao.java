package ink.bignose.catmall.coupon.dao;

import ink.bignose.catmall.coupon.entity.CouponSpuRelationEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券与产品关联
 * 
 * @author Ailenk
 * @websit https://www.bignose.ink
 * @date 2019-04-30 09:39:49
 */
@Mapper
public interface CouponSpuRelationDao extends BaseMapper<CouponSpuRelationEntity> {
	
}
