package ink.bignose.catmall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import ink.bignose.catmall.coupon.entity.CouponHistoryEntity;
import ink.bignose.common.utils.PageUtils;

import java.util.Map;

/**
 * 优惠券领取历史记录
 *
 * @author Ailenk
 * @websit https://www.bignose.ink
 * @date 2019-04-30 09:39:47
 */
public interface CouponHistoryService extends IService<CouponHistoryEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

