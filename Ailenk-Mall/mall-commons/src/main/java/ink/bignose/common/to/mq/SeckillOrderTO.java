package ink.bignose.common.to.mq;

import lombok.Data;

import java.math.BigDecimal;

/**
 * @AUTHOR: Ailenk
 * @DATETIME: 2019/5/29  23:36
 * DESCRIPTION:
 **/
@Data
public class SeckillOrderTO {

    private String orderSn;

    private Long promotionSessionId; // 秒杀活动批次

    private Long skuId;

    private BigDecimal seckillPrice;

    private Integer num;

    private Long memberId;

}
