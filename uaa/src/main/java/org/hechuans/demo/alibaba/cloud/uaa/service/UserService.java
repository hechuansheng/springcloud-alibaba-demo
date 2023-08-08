package org.hechuans.demo.alibaba.cloud.uaa.service;


import org.hechuans.demo.alibaba.cloud.uaa.model.entity.User;

/**
 * @author : hechuansheng
 * @date : 2023/6/6 10:14
 * @description :
 * @since : version-1.0
 */
public interface UserService {

    User findUserByUserName(String userName);

}
