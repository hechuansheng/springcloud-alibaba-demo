package org.hechuans.demo.alibaba.cloud.user.controller;


import org.hechuans.demo.alibaba.cloud.feignapi.api.UserApi;
import org.hechuans.demo.alibaba.cloud.feignapi.pojo.UserVO;
import org.hechuans.demo.alibaba.cloud.user.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author : hechuansheng
 * @date : 2023/6/30 14:34
 * @since : version-1.0
 */
@RestController
@RequestMapping("/user")
public class UserController implements UserApi {

    @Resource
    private UserService userService;

    @GetMapping("getById")
    public UserVO getById(Integer id) {
        return userService.getOne(id);
    }

}
