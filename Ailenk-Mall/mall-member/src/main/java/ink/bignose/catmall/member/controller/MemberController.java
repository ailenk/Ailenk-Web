package ink.bignose.catmall.member.controller;

import java.util.Arrays;
import java.util.Map;

import ink.bignose.catmall.member.exception.PhoneExistException;
import ink.bignose.catmall.member.exception.UsernameExistException;
import ink.bignose.catmall.member.feign.CouponFeign;
import ink.bignose.catmall.member.vo.MemberLoginVO;
import ink.bignose.catmall.member.vo.MemberRegisterVO;
import ink.bignose.catmall.member.vo.SocialUser;
import ink.bignose.common.exception.BizCodeEnum;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.ObjectUtils;
import org.springframework.web.bind.annotation.*;

import ink.bignose.catmall.member.entity.MemberEntity;
import ink.bignose.catmall.member.service.MemberService;
import ink.bignose.common.utils.PageUtils;
import ink.bignose.common.utils.R;



/**
 * 会员
 *
 * @author Ailenk
 * @websit https://www.bignose.ink
 * @date 2019-04-30 09:47:50
 */
@RestController
@RequestMapping("member/member")
public class MemberController {

    @Autowired
    private MemberService memberService;

    @Autowired
    private CouponFeign couponFeign;

    @PostMapping("/register")
    public R register(@RequestBody MemberRegisterVO memberRegisterVO) {
        try {
            memberService.register(memberRegisterVO);
        } catch (UsernameExistException e) {
            return R.error(BizCodeEnum.USERNAME_EXIST_EXCEPTION.getCode(), BizCodeEnum.USERNAME_EXIST_EXCEPTION.getMsg());
        } catch (PhoneExistException e) {
            return R.error(BizCodeEnum.PHONE_EXIST_EXCEPTION.getCode(), BizCodeEnum.PHONE_EXIST_EXCEPTION.getMsg());
        }
        return R.ok();
    }

    @PostMapping("/oauth2/login")
    public R oauthLogin(@RequestBody SocialUser socialUser) throws Exception {
        MemberEntity memberEntity = memberService.login(socialUser);
        if (!ObjectUtils.isEmpty(memberEntity))
            return R.ok().setData(memberEntity);
        else
            return R.error(BizCodeEnum.LOGIN_EXCEPTION.getCode(), BizCodeEnum.LOGIN_EXCEPTION.getMsg());
    }

    @PostMapping("/login")
    public R login(@RequestBody MemberLoginVO memberLoginVO) {
        MemberEntity memberEntity = memberService.login(memberLoginVO);
        if (!ObjectUtils.isEmpty(memberEntity))
            return R.ok().setData(memberEntity);
        else
            return R.error(BizCodeEnum.LOGIN_EXCEPTION.getCode(), BizCodeEnum.LOGIN_EXCEPTION.getMsg());
    }

    @GetMapping("/coupons")
    public R test() {
        MemberEntity memberEntity = new MemberEntity();
        memberEntity.setNickname("Raymond");
        R memberCoupons = couponFeign.memberList();
        return R.ok().put("member", memberEntity).put("coupons", memberCoupons.get("coupons"));
    }

    /**
     * 列表
     */
    @RequestMapping("/list")
    // @RequiresPermissions("member:member:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = memberService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    // @RequiresPermissions("member:member:info")
    public R info(@PathVariable("id") Long id){
		MemberEntity member = memberService.getById(id);

        return R.ok().put("member", member);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    // @RequiresPermissions("member:member:save")
    public R save(@RequestBody MemberEntity member){
		memberService.save(member);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    // @RequiresPermissions("member:member:update")
    public R update(@RequestBody MemberEntity member){
		memberService.updateById(member);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    // @RequiresPermissions("member:member:delete")
    public R delete(@RequestBody Long[] ids){
		memberService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
