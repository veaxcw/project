package com.chengw.common.utils;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import java.util.Objects;

/**
 * @author chengw
 */
public class CookieUtils {

    public static String getCookie(HttpServletRequest request, String name) {

        Cookie[] cookies = request.getCookies();

        if (null == cookies || cookies.length == 0) {
            return null;
        }
        for (Cookie var : cookies) {
            if (Objects.equals(var.getName(), name)) {
                return var.getValue();
            }
        }

        return null;
    }

}
