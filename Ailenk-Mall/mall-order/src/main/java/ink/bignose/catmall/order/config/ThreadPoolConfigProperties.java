package ink.bignose.catmall.order.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @AUTHOR: Ailenk
 * @DATETIME: 2019/5/20  17:07
 * DESCRIPTION:
 **/
@Data
@Component
@ConfigurationProperties(prefix = "mall.threads")
public class ThreadPoolConfigProperties {

    private Integer corePoolSize;

    private Integer maxPoolSize;

    private Integer keepAliveTime;

}
