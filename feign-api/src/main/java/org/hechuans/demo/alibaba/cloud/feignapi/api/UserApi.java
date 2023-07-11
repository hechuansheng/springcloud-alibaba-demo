package org.hechuans.demo.alibaba.cloud.feignapi.api;

import org.hechuans.demo.alibaba.cloud.feignapi.config.FeignConfig;
import org.hechuans.demo.alibaba.cloud.feignapi.pojo.UserVO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author : hechuansheng
 * @date : 2023/7/11 16:11
 * @since : version-1.0
 */
public interface UserApi {

    @GetMapping("/user/getById")
    UserVO getById(@RequestParam("id") Integer id);
}
