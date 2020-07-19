package ink.bignose.common.to.mq;

import lombok.Data;

/**
 * @AUTHOR: Ailenk
 * @DATETIME: 2019/5/27  09:02
 * DESCRIPTION:
 **/
@Data
public class StockDetailTO {

    private Long id;
    /**
     * sku_id
     */
    private Long skuId;
    /**
     * sku_name
     */
    private String skuName;
    /**
     * 购买个数
     */
    private Integer skuNum;
    /**
     * 工作单id
     */
    private Long taskId;

    private Long wareId;

    private Integer lockStatus;

}
