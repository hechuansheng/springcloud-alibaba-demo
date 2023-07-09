package org.hechuans.demo.alibaba.cloud.order.controller;


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
@RestController
@RequestMapping("/order")
public class OrderController {

    @Resource
    private OrderService orderService;

    @GetMapping("getById")
    public OrderVO getById(Integer id) {
        return orderService.getOne(id);
    }
}
