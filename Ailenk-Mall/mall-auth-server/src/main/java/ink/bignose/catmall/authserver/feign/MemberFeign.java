package ink.bignose.catmall.authserver.feign;

import ink.bignose.catmall.authserver.vo.SocialUser;
import ink.bignose.catmall.authserver.vo.UserLoginVO;
import ink.bignose.catmall.authserver.vo.UserRegisterVO;
import ink.bignose.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * @AUTHOR: Ailenk
 * @DATETIME: 2019/5/17  21:02
 * DESCRIPTION:
 **/
@FeignClient("mall-member")
public interface MemberFeign {

    @PostMapping("/member/member/register")
    R register(@RequestBody UserRegisterVO userRegisterVO);

    @PostMapping("/member/member/login")
    R login(@RequestBody UserLoginVO userLoginVO);

    @PostMapping("/member/member/oauth2/login")
    R oauthLogin(@RequestBody SocialUser socialUser) throws Exception;

}
