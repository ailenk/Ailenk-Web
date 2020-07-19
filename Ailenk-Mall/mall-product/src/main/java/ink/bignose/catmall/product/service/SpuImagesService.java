package ink.bignose.catmall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import ink.bignose.common.utils.PageUtils;
import ink.bignose.catmall.product.entity.SpuImagesEntity;

import java.util.List;
import java.util.Map;

/**
 * spu图片
 *
 * @author Ailenk
 * @websit https://www.bignose.ink
 * @date 2019-04-29 23:53:36
 */
public interface SpuImagesService extends IService<SpuImagesEntity> {

    PageUtils queryPage(Map<String, Object> params);

    void saveImages(Long id, List<String> images);

}

