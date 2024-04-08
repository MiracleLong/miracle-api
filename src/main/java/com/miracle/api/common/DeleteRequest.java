package com.miracle.api.common;



import lombok.Data;

import java.io.Serializable;

/**
 * @author dargon
 * @create 2024-04-08
 */
@Data
public class DeleteRequest implements Serializable {
    /**
     * id
     */
    private Long id;

    private static final long serialVersionUID = 1L;
}
