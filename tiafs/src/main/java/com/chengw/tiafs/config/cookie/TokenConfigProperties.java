package com.chengw.tiafs.config.cookie;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Data
@ConfigurationProperties(
        prefix = "token"
)
public class TokenConfigProperties {

    private String cookieName;

    private String headerName;

    private String parameterName;


}
