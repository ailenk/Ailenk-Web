package ink.bignose.catmall.ware.vo;

import lombok.Data;

import java.math.BigDecimal;

/**
 * @AUTHOR: Ailenk
 * @DATETIME: 2019/5/24  15:01
 * DESCRIPTION:
 **/
@Data
public class FareVO {

    private MemberAddressVO memberAddressVO;

    private BigDecimal fare;

}
