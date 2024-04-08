package com.miracle.api.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.miracle.api.model.entity.InterfaceInfo;

/**
 * @author dargon
 * @create 2024-04-08
 * @description 接口服务
 */
public interface InterfaceInfoService extends IService<InterfaceInfo> {

    void validInterfaceInfo(InterfaceInfo interfaceInfo, boolean add);
}

