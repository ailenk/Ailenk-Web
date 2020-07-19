package ink.bignose.catmall.product.vo;

import ink.bignose.catmall.product.entity.SkuImagesEntity;
import ink.bignose.catmall.product.entity.SkuInfoEntity;
import ink.bignose.catmall.product.entity.SpuInfoDescEntity;
import lombok.Data;

import java.util.List;

/**
 * @AUTHOR: Ailenk
 * @DATETIME: 2019/5/17  10:02
 * DESCRIPTION:
 **/
@Data
public class SkuItemVO {

    private SkuInfoEntity info;

    private boolean hasStock = true;

    private List<SkuImagesEntity> images;

    private List<SkuItemSaleAttrVO> saleAttr;

    private SpuInfoDescEntity desp;

    private List<SpuItemAttrGroupVO> groupAttrs;

    private SeckillInfoVO seckillInfo;

}
