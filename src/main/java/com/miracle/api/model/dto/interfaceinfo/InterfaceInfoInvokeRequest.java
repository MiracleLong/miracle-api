package com.miracle.api.model.dto.interfaceinfo;

import lombok.Data;

import java.io.Serializable;

/**
 * @author dargon
 * @create 2024-04-09
 */
@Data
public class InterfaceInfoInvokeRequest implements Serializable {

    /**
     * 主键
     */
    private Long id;

    /**
     * 用户请求参数
     */
    private String userRequestParams;

    private static final long serialVersionUID = 1L;

}
