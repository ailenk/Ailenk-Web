package ink.bignose.catmall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import ink.bignose.catmall.coupon.entity.CouponSpuCategoryRelationEntity;
import ink.bignose.common.utils.PageUtils;

import java.util.Map;

/**
 * 优惠券分类关联
 *
 * @author Ailenk
 * @websit https://www.bignose.ink
 * @date 2019-04-30 09:39:49
 */
public interface CouponSpuCategoryRelationService extends IService<CouponSpuCategoryRelationEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

