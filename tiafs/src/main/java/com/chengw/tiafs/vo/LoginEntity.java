package com.chengw.tiafs.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author chengw
 */
@Data
public class LoginEntity {

    private String username;
    private String password;

    private String checkCode;


}
