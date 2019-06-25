package com.chengw.tiafs.util;

import com.chengw.tiafs.common.MessageEntity;
import com.chengw.tiafs.common.exception.StatusCode;

public class RestfulUtil {

    public static MessageEntity success(Object result){
        return new MessageEntity(StatusCode.OK.getCode(),result,"成功");
    }

    public static MessageEntity fail(Object result){
        return new MessageEntity(StatusCode.FAIL.getCode(),result,"失败");
    }

    public static MessageEntity fail(){
        return new MessageEntity(StatusCode.FAIL_C.getCode(),null,"验证码错误");
    }

    public static MessageEntity fail(String message){
        return new MessageEntity(StatusCode.FAIL_P.getCode(),null,message);
    }


}
