package com.miracle.api.model.dto.user;

import lombok.Data;

import java.io.Serializable;

/**
 * @author dargon
 * @create 2024-04-08
 * @description 用户登录请求体
 */
@Data
public class UserLoginRequest implements Serializable {

    private static final long serialVersionUID = 3191241716373120793L;

    private String userAccount;

    private String userPassword;
}

