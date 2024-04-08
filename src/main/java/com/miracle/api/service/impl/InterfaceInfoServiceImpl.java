package com.miracle.api.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.miracle.api.common.ErrorCode;
import com.miracle.api.exception.BusinessException;
import com.miracle.api.mapper.InterfaceInfoMapper;
import com.miracle.api.model.entity.InterfaceInfo;
import com.miracle.api.service.InterfaceInfoService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

/**
 * @author dargon
 * @create 2024-04-08
 * @description 接口服务
 */
@Service
public class InterfaceInfoServiceImpl extends ServiceImpl<InterfaceInfoMapper, InterfaceInfo>
        implements InterfaceInfoService {

    @Override
    public void validInterfaceInfo(InterfaceInfo interfaceInfo, boolean add) {
        if (interfaceInfo == null) {
            throw new BusinessException(ErrorCode.PARAMS_ERROR);
        }
        String name = interfaceInfo.getName();
        // 创建时，所有参数必须非空
        if (add) {
            if (StringUtils.isAnyBlank(name)) {
                throw new BusinessException(ErrorCode.PARAMS_ERROR);
            }
        }
        if (StringUtils.isNotBlank(name) && name.length() > 50) {
            throw new BusinessException(ErrorCode.PARAMS_ERROR, "名称过长");
        }
    }

}


