package ink.bignose.catmall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import ink.bignose.catmall.member.vo.MemberLoginVO;
import ink.bignose.catmall.member.vo.MemberRegisterVO;
import ink.bignose.catmall.member.vo.SocialUser;
import ink.bignose.common.utils.PageUtils;
import ink.bignose.catmall.member.entity.MemberEntity;

import java.util.Map;

/**
 * 会员
 *
 * @author Ailenk
 * @websit https://www.bignose.ink
 * @date 2019-04-30 09:47:50
 */
public interface MemberService extends IService<MemberEntity> {

    PageUtils queryPage(Map<String, Object> params);

    void register(MemberRegisterVO memberRegisterVO);

    MemberEntity login(MemberLoginVO memberLoginVO);

    MemberEntity login(SocialUser socialUser) throws Exception;
}

