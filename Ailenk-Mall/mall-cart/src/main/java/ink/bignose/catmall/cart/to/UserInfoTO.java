package ink.bignose.catmall.cart.to;

import lombok.Data;
import lombok.ToString;

/**
 * @AUTHOR: Ailenk
 * @DATETIME: 2019/5/20  12:11
 * DESCRIPTION:
 **/
@Data
@ToString
public class UserInfoTO {

    private Long userId;

    private String userKey;

    private boolean tempUser = false;

}
