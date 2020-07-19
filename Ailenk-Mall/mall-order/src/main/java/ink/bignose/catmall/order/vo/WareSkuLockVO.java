package ink.bignose.catmall.order.vo;

import lombok.Data;

import java.util.List;

/**
 * @AUTHOR: Ailenk
 * @DATETIME: 2019/5/24  20:03
 * DESCRIPTION:
 **/
@Data
public class WareSkuLockVO {
    private String orderSn;
    private List<OrderItemVO> locks;
}
