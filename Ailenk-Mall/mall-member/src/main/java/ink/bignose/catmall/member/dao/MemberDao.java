package ink.bignose.catmall.member.dao;

import ink.bignose.catmall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author Ailenk
 * @websit https://www.bignose.ink
 * @date 2019-04-30 09:47:50
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
