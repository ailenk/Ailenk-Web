package ink.bignose.catmall.product.dao;

import ink.bignose.catmall.product.entity.CommentReplayEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品评价回复关系
 * 
 * @author Ailenk
 * @websit https://www.bignose.ink
 * @date 2019-04-29 23:53:34
 */
@Mapper
public interface CommentReplayDao extends BaseMapper<CommentReplayEntity> {
	
}
