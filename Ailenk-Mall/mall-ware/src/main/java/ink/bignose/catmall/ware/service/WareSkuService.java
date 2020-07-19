package ink.bignose.catmall.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import ink.bignose.catmall.ware.vo.SkuHasStockVO;
import ink.bignose.catmall.ware.vo.WareSkuLockVO;
import ink.bignose.common.to.mq.OrderTO;
import ink.bignose.common.to.mq.StockLockedTO;
import ink.bignose.common.utils.PageUtils;
import ink.bignose.catmall.ware.entity.WareSkuEntity;

import java.util.List;
import java.util.Map;

/**
 * 商品库存
 *
 * @author Ailenk

 * @date 2019-04-30 09:51:46
 */
public interface WareSkuService extends IService<WareSkuEntity> {

    PageUtils queryPage(Map<String, Object> params);

    void addStock(Long skuId, Long wareId, Integer skuNum);

    List<SkuHasStockVO> getSkuHasStock(List<Long> skuIds);

    Boolean orderLockStock(WareSkuLockVO vo);

    void unlockStock(StockLockedTO to);

    void unlockStock(OrderTO orderTO);
}

