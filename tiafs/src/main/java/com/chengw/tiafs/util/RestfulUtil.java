package com.chengw.tiafs.util;

import com.chengw.tiafs.common.vo.MessageVO;
import com.chengw.tiafs.common.exception.StatusCode;

public class RestfulUtil {

    public static MessageVO success(Object result){
        return new MessageVO(StatusCode.OK.getCode(),result,"成功");
    }

    public static MessageVO fail(Object result){
        return new MessageVO(StatusCode.FAIL.getCode(),result,"失败");
    }

    public static MessageVO fail(){
        return new MessageVO(StatusCode.FAIL_C.getCode(),null,"验证码错误");
    }

    public static MessageVO fail(String message){
        return new MessageVO(StatusCode.FAIL_P.getCode(),null,message);
    }


}
