package org.hechuans.demo.alibaba.cloud.order.config.rest;

import org.hechuans.demo.alibaba.cloud.order.config.loadbalance.LoadBalancerConfig;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.loadbalancer.annotation.LoadBalancerClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author : hechuansheng
 * @date : 2023/7/6 9:40
 * @since : version-1.0
 */
@Configuration
@LoadBalancerClient(name = "user-service", configuration = LoadBalancerConfig.class)
public class RestTemplateConfig {

    @Bean
    @LoadBalanced
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
