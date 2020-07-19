package ink.bignose.catmall.order.vo;

import ink.bignose.catmall.order.entity.OrderEntity;
import lombok.Data;

/**
 * @AUTHOR: Ailenk
 * @DATETIME: 2019/5/24  16:02
 * DESCRIPTION:
 **/
@Data
public class SubmitOrderResponseVO {

    private OrderEntity orderEntity;

    private Integer code;

}
