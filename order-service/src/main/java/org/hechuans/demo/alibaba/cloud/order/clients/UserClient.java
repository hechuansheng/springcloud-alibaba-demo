package org.hechuans.demo.alibaba.cloud.order.clients;

import org.hechuans.demo.alibaba.cloud.order.config.feign.FeignConfig;
import org.hechuans.demo.alibaba.cloud.order.vo.UserVO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author : hechuansheng
 * @date : 2023/7/11 8:37
 * @since : version-1.0
 */
@FeignClient(value = "user-service", configuration = FeignConfig.class)
public interface UserClient {

    @GetMapping("/user/getById")
    UserVO getById(@RequestParam("id") Integer id);

}
