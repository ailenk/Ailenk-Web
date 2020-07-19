package ink.bignose.catmall.order.vo;

import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

/**
 * @AUTHOR: Ailenk
 * @DATETIME: 2019/5/23  15:11
 * DESCRIPTION:
 **/
@Data
public class OrderItemVO {

    private Long skuId;

    private Boolean checked;

    private String title;

    private String image;

    private List<String> skuAttrs;

    private BigDecimal price;

    private Integer count;

    private BigDecimal totalPrice;

    private BigDecimal weight;

}
