package com.chengw.common.enums;

/**
 * @author chengw
 */
public interface AbstractStatusCode {

     /**
      * 获取状态码
      * @return
      */
     Integer getCode();

     /**
      * 获取信息
      *
      * @return
      */
     String getMessage();

}
