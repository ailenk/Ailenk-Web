package ink.bignose.catmall.ware.vo;

import lombok.Data;

/**
 * @AUTHOR: Ailenk
 * @DATETIME: 2019/5/24  20:05
 * DESCRIPTION:
 **/
@Data
public class LockStockVO {

    private Long skuId;

    private Integer num;

    private Boolean  locked;
    
}
