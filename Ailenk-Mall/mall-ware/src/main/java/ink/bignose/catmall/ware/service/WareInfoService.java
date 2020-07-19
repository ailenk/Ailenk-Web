package ink.bignose.catmall.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import ink.bignose.catmall.ware.entity.WareInfoEntity;
import ink.bignose.catmall.ware.vo.FareVO;
import ink.bignose.common.utils.PageUtils;

import java.util.Map;

/**
 * 仓库信息
 *
 * @author Ailenk
 * @websit https://www.bignose.ink
 * @date 2019-04-30 09:51:46
 */
public interface WareInfoService extends IService<WareInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);

    FareVO getFare(Long attrId);
}

