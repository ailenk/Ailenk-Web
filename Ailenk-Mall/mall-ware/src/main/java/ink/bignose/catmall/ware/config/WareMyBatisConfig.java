package ink.bignose.catmall.ware.config;

import com.baomidou.mybatisplus.extension.plugins.PaginationInterceptor;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @AUTHOR: Ailenk
 * @DATETIME: 2019/5/8  15:33
 * DESCRIPTION:
 **/
@EnableTransactionManagement
@MapperScan("ink.bignose.catmall.ware.dao")
@Configuration
public class WareMyBatisConfig {
    //引入分页插件
    @Bean
    public PaginationInterceptor paginationInterceptor() {
        PaginationInterceptor paginationInterceptor = new PaginationInterceptor();
        return paginationInterceptor;
    }
}
