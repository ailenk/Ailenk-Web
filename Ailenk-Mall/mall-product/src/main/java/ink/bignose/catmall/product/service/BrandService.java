package ink.bignose.catmall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import ink.bignose.common.utils.PageUtils;
import ink.bignose.catmall.product.entity.BrandEntity;

import java.util.Map;

/**
 * 品牌
 *
 * @author Ailenk
 * @websit https://www.bignose.ink
 * @date 2019-04-29 23:53:35
 */
public interface BrandService extends IService<BrandEntity> {

    PageUtils queryPage(Map<String, Object> params);

    void updateDetail(BrandEntity brand);
}

