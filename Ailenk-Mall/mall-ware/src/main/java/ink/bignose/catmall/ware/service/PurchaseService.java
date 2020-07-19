package ink.bignose.catmall.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import ink.bignose.catmall.ware.vo.MergeVo;
import ink.bignose.catmall.ware.vo.PurchaseDoneVo;
import ink.bignose.common.utils.PageUtils;
import ink.bignose.catmall.ware.entity.PurchaseEntity;

import java.util.List;
import java.util.Map;

/**
 * 采购信息
 *
 * @author Ailenk
 * @websit https://www.bignose.ink
 * @date 2019-04-30 09:51:46
 */
public interface PurchaseService extends IService<PurchaseEntity> {

    PageUtils queryPage(Map<String, Object> params);

    PageUtils queryPageUnreceivePurchase(Map<String, Object> params);

    void mergePurchase(MergeVo mergeVo);

    void received(List<Long> ids);

    void done(PurchaseDoneVo doneVo);
}

