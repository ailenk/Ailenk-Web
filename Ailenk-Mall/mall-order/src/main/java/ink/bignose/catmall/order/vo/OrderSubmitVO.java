package ink.bignose.catmall.order.vo;

import lombok.Data;

import java.math.BigDecimal;

/**
 * @AUTHOR: Ailenk
 * @DATETIME: 2019/5/24  15:46
 * DESCRIPTION:
 **/
@Data
public class OrderSubmitVO {

    private Long addrId;

    private Integer payType; // 支付方式

    private String orderToken;

    private BigDecimal payPrice; // 应付价格 验价

    private String note; // 订单备注

}
