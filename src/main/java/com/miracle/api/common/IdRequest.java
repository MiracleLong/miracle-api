package com.miracle.api.common;

import lombok.Data;

import java.io.Serializable;

/**
 * @author dargon
 * @create 2024-04-09
 * @description 根据 id 删除 请求
 */
@Data
public class IdRequest implements Serializable {

    /**
     * id
     */
    private Long id;

    private static final long serialVersionUID = 1L;

}
