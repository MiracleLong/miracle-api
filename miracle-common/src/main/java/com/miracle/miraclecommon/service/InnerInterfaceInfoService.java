package com.miracle.miraclecommon.service;

import com.miracle.miraclecommon.model.entity.InterfaceInfo;

/**
 * @author dargon
 * @create 2024-04-09
 */
public interface InnerInterfaceInfoService {

    /**
     * 从数据库中查询模拟接口是否存在（请求路径、请求方法、请求参数）
     * @param path
     * @param method
     * @return
     */
    InterfaceInfo getInterfaceInfo(String path, String method);

}
