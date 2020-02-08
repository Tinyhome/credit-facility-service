package com.eshare.dto.clientobject;

import com.alibaba.cola.dto.ClientObject;
import lombok.Data;

import java.util.Date;

/**
 * @Author Evan Leung
 *
 * 额度注册客户对象
 */
@Data
public class RegistrationLimitCO extends ClientObject {

    /**
     * 申请ID
     */
    private String applicationId;
    /**
     * 用户ID
     */
    private Long userId;
    /**
     * 产品编号
     */
    private Integer quotaLimit;
    /**
     * 产品编号
     */
    private String productCode;
    /**
     * 产品额度过期日期,非必填
     */
    private Date expirationTime;
    /**
     * 卡类型,1:一次性授信,2:循环授信
     */
    private Integer cardType;

}
