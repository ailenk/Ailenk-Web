package ink.bignose.catmall.product.vo;

import lombok.Data;

/**
 * @AUTHOR: Ailenk
 * @DATETIME: 2019/5/4  17:48
 * DESCRIPTION:
 **/
@Data
public class AttrResponseVO extends AttrVO {

    private String catelogName;

    private String groupName;

    private Long[] catelogPath;

}
