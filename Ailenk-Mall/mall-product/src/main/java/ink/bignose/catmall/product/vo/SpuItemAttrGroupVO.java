package ink.bignose.catmall.product.vo;

import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
 * @AUTHOR: Ailenk
 * @DATETIME: 2019/5/17  10:07
 * DESCRIPTION:
 **/
@Data
@ToString
public class SpuItemAttrGroupVO {

    private String groupName;

    private List<Attr> attrs;

}
