package org.hechuans.demo.alibaba.cloud.order;

import org.hechuans.demo.alibaba.cloud.feignapi.clients.UserClient;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author : hechuansheng
 * @date : 2023/6/30 17:23
 * @since : version-1.0
 */
@EnableFeignClients(clients = UserClient.class)
@SpringBootApplication
public class OrderApplication {

    public static void main(String[] args) {
        SpringApplication.run(OrderApplication.class, args);
    }

}
