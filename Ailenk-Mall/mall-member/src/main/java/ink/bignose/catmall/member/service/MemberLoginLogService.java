package ink.bignose.catmall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import ink.bignose.common.utils.PageUtils;
import ink.bignose.catmall.member.entity.MemberLoginLogEntity;

import java.util.Map;

/**
 * 会员登录记录
 *
 * @author Ailenk
 * @websit https://www.bignose.ink
 * @date 2019-04-30 09:47:49
 */
public interface MemberLoginLogService extends IService<MemberLoginLogEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

