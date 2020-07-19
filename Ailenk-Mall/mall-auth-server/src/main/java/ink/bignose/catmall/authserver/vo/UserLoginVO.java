package ink.bignose.catmall.authserver.vo;

import lombok.Data;

/**
 * @AUTHOR: Ailenk
 * @DATETIME: 2019/5/18  09:51
 * DESCRIPTION:
 **/
@Data
public class UserLoginVO {

    private String account;

    private String password;
}
