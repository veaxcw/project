package com.chengw.common.config.jwt;


import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author chengw
 */
@ConfigurationProperties(
        prefix = "jwt"
)
@Data
public class JwtConfigProperties {

    /**
     * 加密秘钥
     * ***/
    private String encryptSecret;

    /**
     * 时间戳
     * **/
    private String timestampKey;

    private String location;
    /**
     * 过期时间
     * 单位：秒
     * ***/
    private Integer maxAge;

}
