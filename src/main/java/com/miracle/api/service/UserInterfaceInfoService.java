package com.miracle.api.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.miracle.miraclecommon.model.entity.UserInterfaceInfo;

/**
 * @author dargon
 * @create 2024-04-09
 * @description 接口调用统计
 */
public interface UserInterfaceInfoService extends IService<UserInterfaceInfo> {
    void validUserInterfaceInfo(UserInterfaceInfo userInterfaceInfo, boolean add);

    /**
     * 调用接口统计
     * @param interfaceInfoId
     * @param userId
     * @return
     */
    boolean invokeCount(long interfaceInfoId, long userId);

}
