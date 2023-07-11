package org.hechuans.demo.alibaba.cloud.feignapi.config;

import feign.Logger;
import org.springframework.context.annotation.Bean;

/**
 * @author : hechuansheng
 * @date : 2023/7/11 8:36
 * @since : version-1.0
 */

public class FeignConfig {

    @Bean
    public Logger.Level feignLoggerLevel() {
        return Logger.Level.BASIC;
    }
}
