package ink.bignose.catmall.member.exception;

/**
 * @AUTHOR: Ailenk
 * @DATETIME: 2019/5/17  19:45
 * DESCRIPTION:
 **/
public class UsernameExistException extends RuntimeException {
    public UsernameExistException() {
        super("用户名已存在");
    }
}
