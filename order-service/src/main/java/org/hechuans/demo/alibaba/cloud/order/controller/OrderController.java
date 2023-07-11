package org.hechuans.demo.alibaba.cloud.order.controller;


import lombok.extern.slf4j.Slf4j;
import org.hechuans.demo.alibaba.cloud.order.config.OrderDispatchConfig;
import org.hechuans.demo.alibaba.cloud.order.service.OrderService;
import org.hechuans.demo.alibaba.cloud.order.vo.OrderVO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author : hechuansheng
 * @date : 2023/6/30 17:24
 * @since : version-1.0
 */
@Slf4j
@RestController
@RequestMapping("/order")
public class OrderController {

    @Resource
    private OrderService orderService;

    @Resource
    private OrderDispatchConfig orderDispatchConfig;

    @GetMapping("getById")
    public OrderVO getById(Integer id) {
        log.info("orderDispatchConfig: {}", orderDispatchConfig);
        return orderService.getOne(id);
    }
}
