package org.hechuans.demo.alibaba.cloud.order.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.Configuration;

/**
 * @author : hechuansheng
 * @date : 2023/7/10 10:29
 * @since : version-1.0
 */
@Data
@Configuration
@ConfigurationProperties(prefix = "hechuans.order.dispatch")
//@RefreshScope 结合@value实现配置热更新
public class OrderDispatchConfig {

    private String model;
}
