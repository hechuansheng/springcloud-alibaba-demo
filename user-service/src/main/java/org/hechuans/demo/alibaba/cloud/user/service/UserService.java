package org.hechuans.demo.alibaba.cloud.user.service;


import org.hechuans.demo.alibaba.cloud.feignapi.pojo.UserVO;

/**
 * @author : hechuansheng
 * @date : 2023/6/30 17:04
 * @since : version-1.0
 */
public interface UserService {
    UserVO getOne(Integer userId);
}
