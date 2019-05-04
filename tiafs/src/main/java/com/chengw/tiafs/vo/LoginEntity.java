package com.chengw.tiafs.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@ApiModel
@Data
public class LoginEntity {

    @ApiModelProperty(value = "用户名",name = "用户名")
    private String userName;
    @ApiModelProperty(value = "",name = "密码")
    private String password;
}
