package ink.bignose.catmall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import ink.bignose.catmall.product.entity.BrandEntity;
import ink.bignose.common.utils.PageUtils;
import ink.bignose.catmall.product.entity.CategoryBrandRelationEntity;

import java.util.List;
import java.util.Map;

/**
 * 品牌分类关联
 *
 * @author Ailenk
 * @websit https://www.bignose.ink
 * @date 2019-04-29 23:53:35
 */
public interface CategoryBrandRelationService extends IService<CategoryBrandRelationEntity> {

    PageUtils queryPage(Map<String, Object> params);

    void saveDetail(CategoryBrandRelationEntity categoryBrandRelation);

    void updateBrand(Long brandId, String brandName);

    void updateCategory(Long catId, String name);

    List<BrandEntity> getBrandsByCatId(Long catId);
}

