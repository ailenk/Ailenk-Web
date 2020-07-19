package ink.bignose.catmall.seckill.config;

/**
 * @AUTHOR: Ailenk
 * @DATETIME: 2019/5/30  12:19
 * DESCRIPTION:
 **/
// @Configuration
public class SeckillSentinelConfig {

    /**
     * 可能因为版本冲突导致无法引入 WebCallbackManager
     */
//    public SeckillSentinelConfig() {
//        WebCallbackManager.setUrlBlockHandler((request, response, ex) -> {
//            R error = R.error(BizCodeEnum.TOO_MANY_REQUESTS_EXCEPTION.getCode(), BizCodeEnum.TOO_MANY_REQUESTS_EXCEPTION.getMsg());
//            response.setCharacterEncoding("UTF-8");
//            response.setContentType("application/json");
//            response.getWriter().write(JSON.toJSONString(error));
//        });
//    }

}
