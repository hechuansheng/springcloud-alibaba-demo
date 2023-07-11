package org.hechuans.demo.alibaba.cloud.order.service.impl;

import lombok.extern.slf4j.Slf4j;

import org.hechuans.demo.alibaba.cloud.feignapi.clients.UserClient;
import org.hechuans.demo.alibaba.cloud.feignapi.pojo.UserVO;
import org.hechuans.demo.alibaba.cloud.order.service.OrderService;
import org.hechuans.demo.alibaba.cloud.order.vo.OrderVO;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;
import java.util.Date;

/**
 * @author : hechuansheng
 * @date : 2023/6/30 17:27
 * @since : version-1.0
 */
@Slf4j
@Service
public class OrderServiceImpl implements OrderService {

    @Resource
    private RestTemplate restTemplate;

    @Resource
    private UserClient userClient;

    @Override
    public OrderVO getOne(Integer id) {
        OrderVO orderVO = OrderVO.builder()
                .id(id)
                .userId(id)
                .createTime(new Date())
                .offerName("P30-pro")
                .build();

        UserVO userVO = restTemplate.getForObject("http://user-service/user/getById?id=" + id, UserVO.class);

        log.info("OrderServiceImpl.getOne =====>> get userVO http request result: {}", userVO);
        orderVO.setUserVO(userVO);


        userVO = userClient.getById(orderVO.getUserId());

        log.info("OrderServiceImpl.getOne =====>> userClient result: {}", userVO);
        orderVO.setUserVO(userVO);

        return orderVO;
    }




}
