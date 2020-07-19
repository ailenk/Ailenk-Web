package ink.bignose.catmall.product.dao;

import ink.bignose.catmall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author Ailenk
 * @websit https://www.bignose.ink
 * @date 2019-04-29 23:53:35
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
