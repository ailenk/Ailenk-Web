package ink.bignose.catmall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import ink.bignose.catmall.product.vo.SpuSaveVO;
import ink.bignose.common.utils.PageUtils;
import ink.bignose.catmall.product.entity.SpuInfoEntity;

import java.util.Map;

/**
 * spu信息
 *
 * @author Ailenk
 * @websit https://www.bignose.ink
 * @date 2019-04-29 23:53:35
 */
public interface SpuInfoService extends IService<SpuInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);

    void saveSpuInfo(SpuSaveVO vo);

    PageUtils queryPageByCondition(Map<String, Object> params);

    void saveBaseSpuInfo(SpuInfoEntity infoEntity);

    void up(Long spuId);

    SpuInfoEntity getSpuInfoBySkuId(Long skuId);
}

