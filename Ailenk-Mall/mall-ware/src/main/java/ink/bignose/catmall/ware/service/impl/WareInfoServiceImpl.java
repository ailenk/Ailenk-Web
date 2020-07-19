package ink.bignose.catmall.ware.service.impl;

import com.alibaba.fastjson.TypeReference;
import ink.bignose.catmall.ware.feign.MemberFeign;
import ink.bignose.catmall.ware.vo.FareVO;
import ink.bignose.catmall.ware.vo.MemberAddressVO;
import ink.bignose.common.utils.R;
import ink.bignose.catmall.ware.dao.WareInfoDao;
import ink.bignose.catmall.ware.entity.WareInfoEntity;
import ink.bignose.catmall.ware.service.WareInfoService;
import org.apache.commons.lang.StringUtils;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import ink.bignose.common.utils.PageUtils;
import ink.bignose.common.utils.Query;

import org.springframework.util.ObjectUtils;

import javax.annotation.Resource;


@Service("wareInfoService")
public class WareInfoServiceImpl extends ServiceImpl<WareInfoDao, WareInfoEntity> implements WareInfoService {

    @Resource
    private MemberFeign memberFeign;

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        QueryWrapper<WareInfoEntity> wrapper = new QueryWrapper<>();
        String key = (String) params.get("key");
        if (!StringUtils.isEmpty(key)) {
            wrapper.eq("id", key).or()
                    .like("name", key).or()
                    .like("address", key).or()
                    .like("areacode", key);
        }
        IPage<WareInfoEntity> page = this.page(
                new Query<WareInfoEntity>().getPage(params),
                wrapper
        );

        return new PageUtils(page);
    }

    @Override
    public FareVO getFare(Long attrId) {
        FareVO fareVO = new FareVO();
        R r = memberFeign.addrInfo(attrId);
        MemberAddressVO data = r.getData("memberReceiveAddress", new TypeReference<MemberAddressVO>() {});
        if (!ObjectUtils.isEmpty(data)) {
            String phone = data.getPhone();
            String substring = phone.substring(phone.length() - 1);
            fareVO.setFare(new BigDecimal(substring));
            fareVO.setMemberAddressVO(data);
            return fareVO;
        }
        return null;
    }

}