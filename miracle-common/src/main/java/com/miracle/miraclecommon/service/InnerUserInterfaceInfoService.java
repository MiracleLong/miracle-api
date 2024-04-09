package com.miracle.miraclecommon.service;

/**
 * @author dargon
 * @create 2024-04-09
 */
public interface InnerUserInterfaceInfoService {

    /**
     * 调用接口统计
     * @param interfaceInfoId
     * @param userId
     * @return
     */
    boolean invokeCount(long interfaceInfoId, long userId);

}
