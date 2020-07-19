package ink.bignose.catmall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import ink.bignose.catmall.coupon.entity.CouponSpuRelationEntity;
import ink.bignose.common.utils.PageUtils;

import java.util.Map;

/**
 * 优惠券与产品关联
 *
 * @author Ailenk
 * @websit https://www.bignose.ink
 * @date 2019-04-30 09:39:49
 */
public interface CouponSpuRelationService extends IService<CouponSpuRelationEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

