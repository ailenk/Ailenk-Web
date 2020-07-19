package ink.bignose.catmall.order.to;

import ink.bignose.catmall.order.entity.OrderEntity;
import ink.bignose.catmall.order.entity.OrderItemEntity;
import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

/**
 * @AUTHOR: Ailenk
 * @DATETIME: 2019/5/24  17:18
 * DESCRIPTION:
 **/
@Data
public class OrderCreateTO {

    private OrderEntity orderEntity;

    private List<OrderItemEntity> orderItems;

    private BigDecimal payPrice;

    private BigDecimal fare;

}
