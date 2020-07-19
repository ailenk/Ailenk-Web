package ink.bignose.catmall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import ink.bignose.catmall.coupon.entity.HomeSubjectEntity;
import ink.bignose.common.utils.PageUtils;

import java.util.Map;

/**
 * 首页专题表【jd首页下面很多专题，每个专题链接新的页面，展示专题商品信息】
 *
 * @author Ailenk
 * @websit https://www.bignose.ink
 * @date 2019-04-30 09:39:48
 */
public interface HomeSubjectService extends IService<HomeSubjectEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

