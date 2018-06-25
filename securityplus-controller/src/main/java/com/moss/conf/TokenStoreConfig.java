package com.moss.conf;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.oauth2.provider.token.TokenStore;
import org.springframework.security.oauth2.provider.token.store.JwtAccessTokenConverter;
import org.springframework.security.oauth2.provider.token.store.JwtTokenStore;

@Configuration
public class TokenStoreConfig {

    @Configuration
    @ConditionalOnProperty(prefix = "moss.security.oauth2", name = "tokenStore", havingValue = "jwt", matchIfMissing = true)
    public static class JwtConfig {

        @Bean
        public TokenStore jwtTokenStore() {
            return new JwtTokenStore(jwtAccessTokenConverter());
        }

        @Bean
        public JwtAccessTokenConverter jwtAccessTokenConverter(){
            JwtAccessTokenConverter converter = new JwtAccessTokenConverter();
            converter.setSigningKey("moss");
            return converter;
        }

    }
}
