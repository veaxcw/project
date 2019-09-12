package com.chengw.common.utils;


import com.chengw.common.config.jwt.JwtConfigProperties;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.JwtBuilder;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

import java.util.*;

/**
 * JwtToken 工具类
 *
 * @author chengw
 */
public class JwtTokenUtil {

    public static final String AUTHORIZATION_HEADER_STRING = "Bearer";

    private JwtConfigProperties jwtConfigProperties;

    public JwtTokenUtil(JwtConfigProperties jwtConfigProperties) {
        this.jwtConfigProperties = jwtConfigProperties;
    }

    /**
     * @param params
     * @param token
     * @param ticket
     * @return 返回Jwt 字符串Header.Payload.Signature
     */
    public String  generateJwt(Map<String, Object> params, String token, String ticket){
        JwtBuilder builder = Jwts.builder().setHeaderParam("type","jwt");
        Optional.ofNullable(params)
                .orElse(new HashMap<>(0))
                .entrySet().forEach(en-> builder.claim(en.getKey(),en.getValue()));

        return builder.claim(this.jwtConfigProperties.getTimestampKey(),System.currentTimeMillis())
                .claim("token",token)
                .claim("ticket",ticket)
                .setIssuedAt(new Date(System.currentTimeMillis()))
                .setExpiration(new Date(System.currentTimeMillis() + (long)(this.jwtConfigProperties.getMaxAge() * 1000)))
                .signWith(SignatureAlgorithm.HS256,this.jwtConfigProperties.getEncryptSecret().getBytes())
                .compact();


    }

    /**
     * @return 生成令牌
     */
    public String gegenrateToken(){
        return UUID.randomUUID().toString();
    }

    /**
     * @param token 解密令牌
     * @return
     */
    public Map<String ,Object> decodeJwtToken(String token){
        Claims claims = Jwts.parser()
                .setSigningKey(this.jwtConfigProperties.getEncryptSecret().getBytes())
                .parseClaimsJws(token)
                .getBody();

        return claims;
    }

}
