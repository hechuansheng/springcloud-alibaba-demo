package org.hechuans.demo.alibaba.cloud.user.vo;

import lombok.Builder;
import lombok.Data;

import java.io.Serializable;

/**
 * @author : hechuansheng
 * @date : 2023/6/30 17:05
 * @since : version-1.0
 */
@Data
@Builder
public class UserVO implements Serializable {

    private static final long serialVersionUID = 42L;

    private Integer userId;

    private String userName;

}
