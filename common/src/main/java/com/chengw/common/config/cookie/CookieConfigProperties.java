package com.chengw.common.config.cookie;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author chengw
 */
@ConfigurationProperties(
        prefix = "server.servlet.session.cookie"
)
@Data
public class CookieConfigProperties {

    @Value("${server.servlet.session.cookie.name}")
    private String sessionIdName;

    @Value("${server.servlet.session.cookie.max-age}")
    private String maxAge;

    @Value("${server.servlet.session.cookie.path}")
    private String path;

    @Value("${server.servlet.session.cookie.http-only}")
    private Boolean httpOnly;

//    @Value("${server.servlet.session.cookie.secure}")
//    private Boolean secure;

}
