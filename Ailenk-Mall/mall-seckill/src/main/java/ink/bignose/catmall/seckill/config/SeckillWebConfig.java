package ink.bignose.catmall.seckill.config;

import ink.bignose.catmall.seckill.interceptor.LoginUserInterceptor;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import javax.annotation.Resource;

/**
 * @AUTHOR: Ailenk
 * @DATETIME: 2019/5/29  23:12
 * DESCRIPTION:
 **/
public class SeckillWebConfig implements WebMvcConfigurer {

    @Resource
    private LoginUserInterceptor loginUserInterceptor;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(loginUserInterceptor).addPathPatterns("/**");
    }
}
