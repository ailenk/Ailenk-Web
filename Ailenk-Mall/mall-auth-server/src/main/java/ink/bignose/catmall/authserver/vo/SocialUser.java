package ink.bignose.catmall.authserver.vo;

import lombok.Data;

/**
 * @AUTHOR: Ailenk
 * @DATETIME: 2019/5/18  14:50
 * DESCRIPTION:
 **/
@Data
public class SocialUser {

    private String access_token;

    private String remind_in;

    private long expires_in;

    private String uid;

    private String isRealName;
}
