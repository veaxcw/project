package com.chengw.tiafs.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author chengw
 */
@ApiModel
@Data
public class LoginEntity {

    @ApiModelProperty(value = "用户名",name = "用户名")
    private String username;
    @ApiModelProperty(value = "",name = "密码")
    private String password;

    private String checkCode;


}
