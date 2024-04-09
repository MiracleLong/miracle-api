package com.miracle.miraclecommon.service;

import com.miracle.miraclecommon.model.entity.User;

/**
 * @author dargon
 * @create 2024-04-09
 */
public interface InnerUserService {

    /**
     * 数据库中查是否已分配给用户秘钥（accessKey）
     * @param accessKey
     * @return
     */
    User getInvokeUser(String accessKey);

}
