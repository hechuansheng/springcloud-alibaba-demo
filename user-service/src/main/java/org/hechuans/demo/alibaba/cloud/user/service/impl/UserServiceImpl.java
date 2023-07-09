package org.hechuans.demo.alibaba.cloud.user.service.impl;

import lombok.extern.slf4j.Slf4j;

import org.hechuans.demo.alibaba.cloud.user.service.UserService;
import org.hechuans.demo.alibaba.cloud.user.vo.UserVO;
import org.springframework.stereotype.Service;

/**
 * @author : hechuansheng
 * @date : 2023/6/30 17:05
 * @since : version-1.0
 */
@Slf4j
@Service
public class UserServiceImpl implements UserService {

    @Override
    public UserVO getOne(Integer userId) {

        log.info("UserServiceImpl.getOne =====>> start method, userId: {}", userId);

        return UserVO.builder().userId(userId).userName("张三").build();
    }
}
