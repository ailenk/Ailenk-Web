package ink.bignose.catmall.gateway.config;

import com.alibaba.csp.sentinel.adapter.gateway.sc.callback.GatewayCallbackManager;
import com.alibaba.fastjson.JSON;
import ink.bignose.common.exception.BizCodeEnum;
import ink.bignose.common.utils.R;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

/**
 * @AUTHOR: Ailenk
 * @DATETIME: 2019/5/30  16:20
 * DESCRIPTION:
 **/
@Configuration
public class SentinelGatewayConfig {

    public SentinelGatewayConfig() {
        GatewayCallbackManager.setBlockHandler(((exchange, t) -> {
            R error = R.error(BizCodeEnum.TOO_MANY_REQUESTS.getCode(), BizCodeEnum.TOO_MANY_REQUESTS.getMsg());
            String jsonString = JSON.toJSONString(error);
            // Mono<ServerResponse> body = ServerResponse.ok().body(Mono.just(jsonString), String.class);
            return ServerResponse.ok().body(Mono.just(jsonString), String.class);
        }));
    }

}
