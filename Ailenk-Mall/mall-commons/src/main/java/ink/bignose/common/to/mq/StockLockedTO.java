package ink.bignose.common.to.mq;

import lombok.Data;

/**
 * @AUTHOR: Ailenk
 * @DATETIME: 2019/5/26  23:44
 * DESCRIPTION:
 **/
@Data
public class StockLockedTO {

    private Long id;

    private StockDetailTO detail;

}
