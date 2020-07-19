package ink.bignose.catmall.member.exception;

/**
 * @AUTHOR: Ailenk
 * @DATETIME: 2019/5/17  19:44
 * DESCRIPTION:
 **/
public class PhoneExistException extends RuntimeException {
    public PhoneExistException() {
        super("手机号已存在");
    }
}
