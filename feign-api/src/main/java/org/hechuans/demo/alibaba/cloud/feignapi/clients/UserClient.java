package org.hechuans.demo.alibaba.cloud.feignapi.clients;

import org.hechuans.demo.alibaba.cloud.feignapi.api.UserApi;
import org.hechuans.demo.alibaba.cloud.feignapi.config.FeignConfig;
import org.hechuans.demo.alibaba.cloud.feignapi.pojo.UserVO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author : hechuansheng
 * @date : 2023/7/11 8:37
 * @since : version-1.0
 */
@FeignClient(value = "user-service", configuration = FeignConfig.class)
public interface UserClient extends UserApi {

    @GetMapping("/user/getById")
    UserVO getById(@RequestParam("id") Integer id);

}
