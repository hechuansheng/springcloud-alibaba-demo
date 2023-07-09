package org.hechuans.demo.alibaba.cloud.order.service;


import org.hechuans.demo.alibaba.cloud.order.vo.OrderVO;

/**
 * @author : hechuansheng
 * @date : 2023/6/30 17:27
 * @since : version-1.0
 */
public interface OrderService {

    OrderVO getOne(Integer id);
}
