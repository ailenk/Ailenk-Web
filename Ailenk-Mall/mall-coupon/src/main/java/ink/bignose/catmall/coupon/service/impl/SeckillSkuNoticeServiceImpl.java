package ink.bignose.catmall.coupon.service.impl;

import ink.bignose.catmall.coupon.dao.SeckillSkuNoticeDao;
import ink.bignose.catmall.coupon.entity.SeckillSkuNoticeEntity;
import ink.bignose.catmall.coupon.service.SeckillSkuNoticeService;
import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import ink.bignose.common.utils.PageUtils;
import ink.bignose.common.utils.Query;


@Service("seckillSkuNoticeService")
public class SeckillSkuNoticeServiceImpl extends ServiceImpl<SeckillSkuNoticeDao, SeckillSkuNoticeEntity> implements SeckillSkuNoticeService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<SeckillSkuNoticeEntity> page = this.page(
                new Query<SeckillSkuNoticeEntity>().getPage(params),
                new QueryWrapper<SeckillSkuNoticeEntity>()
        );

        return new PageUtils(page);
    }

}